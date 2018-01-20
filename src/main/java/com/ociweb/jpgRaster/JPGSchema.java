package com.ociweb.jpgRaster;

import com.ociweb.pronghorn.pipe.DataInputBlobReader;
import com.ociweb.pronghorn.pipe.FieldReferenceOffsetManager;
import com.ociweb.pronghorn.pipe.MessageSchema;
import com.ociweb.pronghorn.pipe.Pipe;
import com.ociweb.pronghorn.pipe.PipeReader;
import com.ociweb.pronghorn.pipe.PipeWriter;

public class JPGSchema extends MessageSchema<JPGSchema> {
	protected JPGSchema(FieldReferenceOffsetManager from) { 
		super(from);
	}

	public final static FieldReferenceOffsetManager FROM = new FieldReferenceOffsetManager(
		new int[]{0xc0400009,0x88000000,0x88000001,0xa0000000,0xa0000001,0x88000002,0x88000003,0x88000004,0x88000005,0xc0200009,0xc0400007,0x88000006,0x88000007,0x88000008,0x88000009,0x8800000a,0x8800000b,0xc0200007,0xc0400003,0x8800000c,0xb8000002,0xc0200003,0xc0400004,0x8800000d,0xb8000003,0xb8000004,0xc0200004,0xc0400003,0x8800000e,0xb8000005,0xc0200003,0xc0400004,0xb8000006,0xb8000007,0xb8000008,0xc0200004,0xc0400002,0xb8000009,0xc0200002},
		(short)0,
		new String[]{"HeaderMessage","height","width","filename","frameType","precision","startOfSelection",
		"endOfSelection","successiveApproximation",null,"ColorComponentMessage","componentID",
		"horizontalSamplingFactor","verticalSamplingFactor","quantizationTableID","huffmanACTableID",
		"huffmanDCTableID",null,"CompressedDataMessage","length","data",null,"HuffmanTableMessage",
		"tableId","lengths","table",null,"QuantizationTableMessage","tableId","table",null,
		"MCUMessage","y","cb","cr",null,"PixelRowMessage","pixels",null},
		new long[]{1, 101, 201, 301, 401, 501, 601, 701, 801, 0, 2, 102, 202, 302, 402, 502, 602, 0, 3, 103, 203, 0, 4, 104, 204, 304, 0, 5, 105, 205, 0, 6, 106, 206, 306, 0, 7, 107, 0},
		new String[]{"global",null,null,null,null,null,null,null,null,null,"global",null,null,null,null,
		null,null,null,"global",null,null,null,"global",null,null,null,null,"global",null,
		null,null,"global",null,null,null,null,"global",null,null},
		"JPGSchema.xml",
		new long[]{2, 2, 0},
		new int[]{2, 2, 0});

	protected JPGSchema() { 
		super(FROM);
	}

	public static final JPGSchema instance = new JPGSchema();

	public static final int MSG_HEADERMESSAGE_1 = 0x00000000; //Group/OpenTempl/9
	public static final int MSG_HEADERMESSAGE_1_FIELD_HEIGHT_101 = 0x00400001; //IntegerSigned/None/0
	public static final int MSG_HEADERMESSAGE_1_FIELD_WIDTH_201 = 0x00400002; //IntegerSigned/None/1
	public static final int MSG_HEADERMESSAGE_1_FIELD_FILENAME_301 = 0x01000003; //ASCII/None/0
	public static final int MSG_HEADERMESSAGE_1_FIELD_FRAMETYPE_401 = 0x01000005; //ASCII/None/1
	public static final int MSG_HEADERMESSAGE_1_FIELD_PRECISION_501 = 0x00400007; //IntegerSigned/None/2
	public static final int MSG_HEADERMESSAGE_1_FIELD_STARTOFSELECTION_601 = 0x00400008; //IntegerSigned/None/3
	public static final int MSG_HEADERMESSAGE_1_FIELD_ENDOFSELECTION_701 = 0x00400009; //IntegerSigned/None/4
	public static final int MSG_HEADERMESSAGE_1_FIELD_SUCCESSIVEAPPROXIMATION_801 = 0x0040000a; //IntegerSigned/None/5
	public static final int MSG_COLORCOMPONENTMESSAGE_2 = 0x0000000a; //Group/OpenTempl/7
	public static final int MSG_COLORCOMPONENTMESSAGE_2_FIELD_COMPONENTID_102 = 0x00400001; //IntegerSigned/None/6
	public static final int MSG_COLORCOMPONENTMESSAGE_2_FIELD_HORIZONTALSAMPLINGFACTOR_202 = 0x00400002; //IntegerSigned/None/7
	public static final int MSG_COLORCOMPONENTMESSAGE_2_FIELD_VERTICALSAMPLINGFACTOR_302 = 0x00400003; //IntegerSigned/None/8
	public static final int MSG_COLORCOMPONENTMESSAGE_2_FIELD_QUANTIZATIONTABLEID_402 = 0x00400004; //IntegerSigned/None/9
	public static final int MSG_COLORCOMPONENTMESSAGE_2_FIELD_HUFFMANACTABLEID_502 = 0x00400005; //IntegerSigned/None/10
	public static final int MSG_COLORCOMPONENTMESSAGE_2_FIELD_HUFFMANDCTABLEID_602 = 0x00400006; //IntegerSigned/None/11
	public static final int MSG_COMPRESSEDDATAMESSAGE_3 = 0x00000012; //Group/OpenTempl/3
	public static final int MSG_COMPRESSEDDATAMESSAGE_3_FIELD_LENGTH_103 = 0x00400001; //IntegerSigned/None/12
	public static final int MSG_COMPRESSEDDATAMESSAGE_3_FIELD_DATA_203 = 0x01c00002; //ByteVector/None/2
	public static final int MSG_HUFFMANTABLEMESSAGE_4 = 0x00000016; //Group/OpenTempl/4
	public static final int MSG_HUFFMANTABLEMESSAGE_4_FIELD_TABLEID_104 = 0x00400001; //IntegerSigned/None/13
	public static final int MSG_HUFFMANTABLEMESSAGE_4_FIELD_LENGTHS_204 = 0x01c00002; //ByteVector/None/3
	public static final int MSG_HUFFMANTABLEMESSAGE_4_FIELD_TABLE_304 = 0x01c00004; //ByteVector/None/4
	public static final int MSG_QUANTIZATIONTABLEMESSAGE_5 = 0x0000001b; //Group/OpenTempl/3
	public static final int MSG_QUANTIZATIONTABLEMESSAGE_5_FIELD_TABLEID_105 = 0x00400001; //IntegerSigned/None/14
	public static final int MSG_QUANTIZATIONTABLEMESSAGE_5_FIELD_TABLE_205 = 0x01c00002; //ByteVector/None/5
	public static final int MSG_MCUMESSAGE_6 = 0x0000001f; //Group/OpenTempl/4
	public static final int MSG_MCUMESSAGE_6_FIELD_Y_106 = 0x01c00001; //ByteVector/None/6
	public static final int MSG_MCUMESSAGE_6_FIELD_CB_206 = 0x01c00003; //ByteVector/None/7
	public static final int MSG_MCUMESSAGE_6_FIELD_CR_306 = 0x01c00005; //ByteVector/None/8
	public static final int MSG_PIXELROWMESSAGE_7 = 0x00000024; //Group/OpenTempl/2
	public static final int MSG_PIXELROWMESSAGE_7_FIELD_PIXELS_107 = 0x01c00001; //ByteVector/None/9

	public static void consume(Pipe<JPGSchema> input) {
		while (PipeReader.tryReadFragment(input)) {
			int msgIdx = PipeReader.getMsgIdx(input);
			switch(msgIdx) {
				case MSG_HEADERMESSAGE_1:
					consumeHeaderMessage(input);
				break;
				case MSG_COLORCOMPONENTMESSAGE_2:
					consumeColorComponentMessage(input);
				break;
				case MSG_COMPRESSEDDATAMESSAGE_3:
					consumeCompressedDataMessage(input);
				break;
				case MSG_HUFFMANTABLEMESSAGE_4:
					consumeHuffmanTableMessage(input);
				break;
				case MSG_QUANTIZATIONTABLEMESSAGE_5:
					consumeQuantizationTableMessage(input);
				break;
				case MSG_MCUMESSAGE_6:
					consumeMCUMessage(input);
				break;
				case MSG_PIXELROWMESSAGE_7:
					consumePixelRowMessage(input);
				break;
				case -1:
				   //requestShutdown();
				break;
			}
			PipeReader.releaseReadLock(input);
		}
	}

	public static void consumeHeaderMessage(Pipe<JPGSchema> input) {
		int fieldheight = PipeReader.readInt(input,MSG_HEADERMESSAGE_1_FIELD_HEIGHT_101);
		int fieldwidth = PipeReader.readInt(input,MSG_HEADERMESSAGE_1_FIELD_WIDTH_201);
		StringBuilder fieldfilename = PipeReader.readUTF8(input,MSG_HEADERMESSAGE_1_FIELD_FILENAME_301,new StringBuilder(PipeReader.readBytesLength(input,MSG_HEADERMESSAGE_1_FIELD_FILENAME_301)));
		StringBuilder fieldframeType = PipeReader.readUTF8(input,MSG_HEADERMESSAGE_1_FIELD_FRAMETYPE_401,new StringBuilder(PipeReader.readBytesLength(input,MSG_HEADERMESSAGE_1_FIELD_FRAMETYPE_401)));
		int fieldprecision = PipeReader.readInt(input,MSG_HEADERMESSAGE_1_FIELD_PRECISION_501);
		int fieldstartOfSelection = PipeReader.readInt(input,MSG_HEADERMESSAGE_1_FIELD_STARTOFSELECTION_601);
		int fieldendOfSelection = PipeReader.readInt(input,MSG_HEADERMESSAGE_1_FIELD_ENDOFSELECTION_701);
		int fieldsuccessiveApproximation = PipeReader.readInt(input,MSG_HEADERMESSAGE_1_FIELD_SUCCESSIVEAPPROXIMATION_801);
	}
	public static void consumeColorComponentMessage(Pipe<JPGSchema> input) {
		int fieldcomponentID = PipeReader.readInt(input,MSG_COLORCOMPONENTMESSAGE_2_FIELD_COMPONENTID_102);
		int fieldhorizontalSamplingFactor = PipeReader.readInt(input,MSG_COLORCOMPONENTMESSAGE_2_FIELD_HORIZONTALSAMPLINGFACTOR_202);
		int fieldverticalSamplingFactor = PipeReader.readInt(input,MSG_COLORCOMPONENTMESSAGE_2_FIELD_VERTICALSAMPLINGFACTOR_302);
		int fieldquantizationTableID = PipeReader.readInt(input,MSG_COLORCOMPONENTMESSAGE_2_FIELD_QUANTIZATIONTABLEID_402);
		int fieldhuffmanACTableID = PipeReader.readInt(input,MSG_COLORCOMPONENTMESSAGE_2_FIELD_HUFFMANACTABLEID_502);
		int fieldhuffmanDCTableID = PipeReader.readInt(input,MSG_COLORCOMPONENTMESSAGE_2_FIELD_HUFFMANDCTABLEID_602);
	}
	public static void consumeCompressedDataMessage(Pipe<JPGSchema> input) {
		int fieldlength = PipeReader.readInt(input,MSG_COMPRESSEDDATAMESSAGE_3_FIELD_LENGTH_103);
		DataInputBlobReader<JPGSchema> fielddata = PipeReader.inputStream(input, MSG_COMPRESSEDDATAMESSAGE_3_FIELD_DATA_203);
	}
	public static void consumeHuffmanTableMessage(Pipe<JPGSchema> input) {
		int fieldtableId = PipeReader.readInt(input,MSG_HUFFMANTABLEMESSAGE_4_FIELD_TABLEID_104);
		DataInputBlobReader<JPGSchema> fieldlengths = PipeReader.inputStream(input, MSG_HUFFMANTABLEMESSAGE_4_FIELD_LENGTHS_204);
		DataInputBlobReader<JPGSchema> fieldtable = PipeReader.inputStream(input, MSG_HUFFMANTABLEMESSAGE_4_FIELD_TABLE_304);
	}
	public static void consumeQuantizationTableMessage(Pipe<JPGSchema> input) {
		int fieldtableId = PipeReader.readInt(input,MSG_QUANTIZATIONTABLEMESSAGE_5_FIELD_TABLEID_105);
		DataInputBlobReader<JPGSchema> fieldtable = PipeReader.inputStream(input, MSG_QUANTIZATIONTABLEMESSAGE_5_FIELD_TABLE_205);
	}
	public static void consumeMCUMessage(Pipe<JPGSchema> input) {
		DataInputBlobReader<JPGSchema> fieldy = PipeReader.inputStream(input, MSG_MCUMESSAGE_6_FIELD_Y_106);
		DataInputBlobReader<JPGSchema> fieldcb = PipeReader.inputStream(input, MSG_MCUMESSAGE_6_FIELD_CB_206);
		DataInputBlobReader<JPGSchema> fieldcr = PipeReader.inputStream(input, MSG_MCUMESSAGE_6_FIELD_CR_306);
	}
	public static void consumePixelRowMessage(Pipe<JPGSchema> input) {
		DataInputBlobReader<JPGSchema> fieldpixels = PipeReader.inputStream(input, MSG_PIXELROWMESSAGE_7_FIELD_PIXELS_107);
	}

	public static void publishHeaderMessage(Pipe<JPGSchema> output, int fieldheight, int fieldwidth, CharSequence fieldfilename, CharSequence fieldframeType, int fieldprecision, int fieldstartOfSelection, int fieldendOfSelection, int fieldsuccessiveApproximation) {
		PipeWriter.presumeWriteFragment(output, MSG_HEADERMESSAGE_1);
		PipeWriter.writeInt(output,MSG_HEADERMESSAGE_1_FIELD_HEIGHT_101, fieldheight);
		PipeWriter.writeInt(output,MSG_HEADERMESSAGE_1_FIELD_WIDTH_201, fieldwidth);
		PipeWriter.writeUTF8(output,MSG_HEADERMESSAGE_1_FIELD_FILENAME_301, fieldfilename);
		PipeWriter.writeUTF8(output,MSG_HEADERMESSAGE_1_FIELD_FRAMETYPE_401, fieldframeType);
		PipeWriter.writeInt(output,MSG_HEADERMESSAGE_1_FIELD_PRECISION_501, fieldprecision);
		PipeWriter.writeInt(output,MSG_HEADERMESSAGE_1_FIELD_STARTOFSELECTION_601, fieldstartOfSelection);
		PipeWriter.writeInt(output,MSG_HEADERMESSAGE_1_FIELD_ENDOFSELECTION_701, fieldendOfSelection);
		PipeWriter.writeInt(output,MSG_HEADERMESSAGE_1_FIELD_SUCCESSIVEAPPROXIMATION_801, fieldsuccessiveApproximation);
		PipeWriter.publishWrites(output);
	}
	public static void publishColorComponentMessage(Pipe<JPGSchema> output, int fieldcomponentID, int fieldhorizontalSamplingFactor, int fieldverticalSamplingFactor, int fieldquantizationTableID, int fieldhuffmanACTableID, int fieldhuffmanDCTableID) {
		PipeWriter.presumeWriteFragment(output, MSG_COLORCOMPONENTMESSAGE_2);
		PipeWriter.writeInt(output,MSG_COLORCOMPONENTMESSAGE_2_FIELD_COMPONENTID_102, fieldcomponentID);
		PipeWriter.writeInt(output,MSG_COLORCOMPONENTMESSAGE_2_FIELD_HORIZONTALSAMPLINGFACTOR_202, fieldhorizontalSamplingFactor);
		PipeWriter.writeInt(output,MSG_COLORCOMPONENTMESSAGE_2_FIELD_VERTICALSAMPLINGFACTOR_302, fieldverticalSamplingFactor);
		PipeWriter.writeInt(output,MSG_COLORCOMPONENTMESSAGE_2_FIELD_QUANTIZATIONTABLEID_402, fieldquantizationTableID);
		PipeWriter.writeInt(output,MSG_COLORCOMPONENTMESSAGE_2_FIELD_HUFFMANACTABLEID_502, fieldhuffmanACTableID);
		PipeWriter.writeInt(output,MSG_COLORCOMPONENTMESSAGE_2_FIELD_HUFFMANDCTABLEID_602, fieldhuffmanDCTableID);
		PipeWriter.publishWrites(output);
	}
	public static void publishCompressedDataMessage(Pipe<JPGSchema> output, int fieldlength, byte[] fielddataBacking, int fielddataPosition, int fielddataLength) {
		PipeWriter.presumeWriteFragment(output, MSG_COMPRESSEDDATAMESSAGE_3);
		PipeWriter.writeInt(output,MSG_COMPRESSEDDATAMESSAGE_3_FIELD_LENGTH_103, fieldlength);
		PipeWriter.writeBytes(output,MSG_COMPRESSEDDATAMESSAGE_3_FIELD_DATA_203, fielddataBacking, fielddataPosition, fielddataLength);
		PipeWriter.publishWrites(output);
	}
	public static void publishHuffmanTableMessage(Pipe<JPGSchema> output, int fieldtableId, byte[] fieldlengthsBacking, int fieldlengthsPosition, int fieldlengthsLength, byte[] fieldtableBacking, int fieldtablePosition, int fieldtableLength) {
		PipeWriter.presumeWriteFragment(output, MSG_HUFFMANTABLEMESSAGE_4);
		PipeWriter.writeInt(output,MSG_HUFFMANTABLEMESSAGE_4_FIELD_TABLEID_104, fieldtableId);
		PipeWriter.writeBytes(output,MSG_HUFFMANTABLEMESSAGE_4_FIELD_LENGTHS_204, fieldlengthsBacking, fieldlengthsPosition, fieldlengthsLength);
		PipeWriter.writeBytes(output,MSG_HUFFMANTABLEMESSAGE_4_FIELD_TABLE_304, fieldtableBacking, fieldtablePosition, fieldtableLength);
		PipeWriter.publishWrites(output);
	}
	public static void publishQuantizationTableMessage(Pipe<JPGSchema> output, int fieldtableId, byte[] fieldtableBacking, int fieldtablePosition, int fieldtableLength) {
		PipeWriter.presumeWriteFragment(output, MSG_QUANTIZATIONTABLEMESSAGE_5);
		PipeWriter.writeInt(output,MSG_QUANTIZATIONTABLEMESSAGE_5_FIELD_TABLEID_105, fieldtableId);
		PipeWriter.writeBytes(output,MSG_QUANTIZATIONTABLEMESSAGE_5_FIELD_TABLE_205, fieldtableBacking, fieldtablePosition, fieldtableLength);
		PipeWriter.publishWrites(output);
	}
	public static void publishMCUMessage(Pipe<JPGSchema> output, byte[] fieldyBacking, int fieldyPosition, int fieldyLength, byte[] fieldcbBacking, int fieldcbPosition, int fieldcbLength, byte[] fieldcrBacking, int fieldcrPosition, int fieldcrLength) {
		PipeWriter.presumeWriteFragment(output, MSG_MCUMESSAGE_6);
		PipeWriter.writeBytes(output,MSG_MCUMESSAGE_6_FIELD_Y_106, fieldyBacking, fieldyPosition, fieldyLength);
		PipeWriter.writeBytes(output,MSG_MCUMESSAGE_6_FIELD_CB_206, fieldcbBacking, fieldcbPosition, fieldcbLength);
		PipeWriter.writeBytes(output,MSG_MCUMESSAGE_6_FIELD_CR_306, fieldcrBacking, fieldcrPosition, fieldcrLength);
		PipeWriter.publishWrites(output);
	}
	public static void publishPixelRowMessage(Pipe<JPGSchema> output, byte[] fieldpixelsBacking, int fieldpixelsPosition, int fieldpixelsLength) {
		PipeWriter.presumeWriteFragment(output, MSG_PIXELROWMESSAGE_7);
		PipeWriter.writeBytes(output,MSG_PIXELROWMESSAGE_7_FIELD_PIXELS_107, fieldpixelsBacking, fieldpixelsPosition, fieldpixelsLength);
		PipeWriter.publishWrites(output);
	}
}
