package com.ociweb.jpgRaster;

import static org.junit.Assert.assertTrue;

import java.util.Random;
import org.junit.Before;
import org.junit.Test;

public class InverseQuantizerTest {
    private JPG.Header header;

    @Before
    public void initializeHeader() {
        // These tables are obtained from running djpeg on jpeg_test.jpg
        // from the test_jpeg folder.
        JPG.QuantizationTable qTable;
        qTable = new JPG.QuantizationTable();
        qTable.tableID = 0;
        qTable.precision = 0;
        qTable.table = new int[]{
                2, 1, 1, 2, 3, 5, 6, 7,
                1, 1, 2, 2, 3, 7, 7, 7,
                2, 2, 2, 3, 5, 7, 8, 7,
                2, 2, 3, 3, 6, 10, 10, 7,
                2, 3, 4, 7, 8, 13, 12, 9,
                3, 4, 7, 8, 10, 12, 14, 11,
                6, 8, 9, 10, 12, 15, 14, 12,
                9, 11, 11, 12, 13, 12, 12, 12
        };
        header = new JPG.Header();
        header.quantizationTables.add(qTable);
        qTable = new JPG.QuantizationTable();
        qTable.tableID = 1;
        qTable.precision = 0;
        qTable.table = new int[]{
                2, 2, 3, 6, 12, 12, 12, 12,
                2, 3, 3, 8, 12, 12, 12, 12,
                3, 3, 7, 12, 12, 12, 12, 12,
                6, 8, 12, 12, 12, 12, 12, 12,
                12, 12, 12, 12, 12, 12, 12, 12,
                12, 12, 12, 12, 12, 12, 12, 12,
                12, 12, 12, 12, 12, 12, 12, 12,
                12, 12, 12, 12, 12, 12, 12, 12
        };
        header.quantizationTables.add(qTable);
        // Setup Color Components
        JPG.ColorComponent colorComponent;
        colorComponent = new JPG.ColorComponent();
        colorComponent.quantizationTableID = 0;
        header.colorComponents.add(colorComponent);
        colorComponent = new JPG.ColorComponent();
        colorComponent.quantizationTableID = 1;
        header.colorComponents.add(colorComponent);
        colorComponent = new JPG.ColorComponent();
        colorComponent.quantizationTableID = 1;
        header.colorComponents.add(colorComponent);
    }

    @Test
    public void zeroDequantizeTest() {
        JPG.MCU inputmcu;
        JPG.MCU outputmcu;
        // Initialize input MCU
        inputmcu = new JPG.MCU();
        for (int i = 0; i < 64; i++) {
            inputmcu.y[i] = 0;
            inputmcu.cb[i] = 0;
            inputmcu.cr[i] = 0;
        }
        // Initialize output MCU
        outputmcu = new JPG.MCU();
        for (int i = 0; i < 64; i++) {
            outputmcu.y[i] = inputmcu.y[i];
            outputmcu.cb[i] = inputmcu.cb[i];
            outputmcu.cr[i] = inputmcu.cr[i];
        }
        // Call function
        InverseQuantizer.dequantize(outputmcu, header);
        // Check output MCU against expected result
        for (int i = 0; i < 64; i++) {
            assertTrue(outputmcu.y[i] == (inputmcu.y[i] * header.quantizationTables.get(0).table[i]));
            assertTrue(outputmcu.cb[i] == (inputmcu.cb[i] * header.quantizationTables.get(1).table[i]));
            assertTrue(outputmcu.cr[i] == (inputmcu.cr[i] * header.quantizationTables.get(1).table[i]));
        }
    }

    @Test
    public void randomDequantizeTest() {
        Random rand;
        JPG.MCU inputmcu;
        JPG.MCU outputmcu;
        // Initialize Random
        rand = new Random();
        // Initialize input MCU
        inputmcu = new JPG.MCU();
        for (int i = 0; i < 64; i++) {
            inputmcu.y[i] = (short) rand.nextInt(256);
            inputmcu.cb[i] = (short) rand.nextInt(256);
            inputmcu.cr[i] = (short) rand.nextInt(256);
        }
        // Initialize output MCU
        outputmcu = new JPG.MCU();
        for (int i = 0; i < 64; i++) {
            outputmcu.y[i] = inputmcu.y[i];
            outputmcu.cb[i] = inputmcu.cb[i];
            outputmcu.cr[i] = inputmcu.cr[i];
        }
        // Call function
        InverseQuantizer.dequantize(outputmcu, header);
        // Check output MCU against expected result
        for (int i = 0; i < 64; i++) {
            assertTrue(outputmcu.y[i] == (inputmcu.y[i] * header.quantizationTables.get(0).table[i]));
            assertTrue(outputmcu.cb[i] == (inputmcu.cb[i] * header.quantizationTables.get(1).table[i]));
            assertTrue(outputmcu.cr[i] == (inputmcu.cr[i] * header.quantizationTables.get(1).table[i]));
        }
    }
}