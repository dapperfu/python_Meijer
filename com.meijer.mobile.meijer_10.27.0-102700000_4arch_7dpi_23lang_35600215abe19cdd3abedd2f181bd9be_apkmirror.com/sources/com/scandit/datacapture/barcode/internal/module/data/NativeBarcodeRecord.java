package com.scandit.datacapture.barcode.internal.module.data;

import com.scandit.datacapture.barcode.data.CompositeFlag;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.core.common.buffer.EncodingRange;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import java.util.ArrayList;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class NativeBarcodeRecord {
    final String addOnData;
    final boolean colorInverted;
    final String compositeData;
    final CompositeFlag compositeFlag;
    final byte[] compositeRawData;
    final byte[] data;
    final ArrayList<EncodingRange> dataEncoding;
    final int frameId;
    final Integer globalId;
    final boolean gs1DataCarrier;
    final Quadrilateral location;
    final float pixelsPerComponent;
    final boolean structuredAppend;
    final int symbolCount;
    final Symbology symbology;
    final String uniqueHash;
    final String utf8String;

    public String getAddOnData() {
        return this.addOnData;
    }

    public boolean getColorInverted() {
        return this.colorInverted;
    }

    public String getCompositeData() {
        return this.compositeData;
    }

    public CompositeFlag getCompositeFlag() {
        return this.compositeFlag;
    }

    public byte[] getCompositeRawData() {
        return this.compositeRawData;
    }

    public byte[] getData() {
        return this.data;
    }

    public ArrayList<EncodingRange> getDataEncoding() {
        return this.dataEncoding;
    }

    public int getFrameId() {
        return this.frameId;
    }

    public Integer getGlobalId() {
        return this.globalId;
    }

    public boolean getGs1DataCarrier() {
        return this.gs1DataCarrier;
    }

    public Quadrilateral getLocation() {
        return this.location;
    }

    public float getPixelsPerComponent() {
        return this.pixelsPerComponent;
    }

    public boolean getStructuredAppend() {
        return this.structuredAppend;
    }

    public int getSymbolCount() {
        return this.symbolCount;
    }

    public Symbology getSymbology() {
        return this.symbology;
    }

    public String getUniqueHash() {
        return this.uniqueHash;
    }

    public String getUtf8String() {
        return this.utf8String;
    }

    public String toString() {
        return "NativeBarcodeRecord{symbology=" + this.symbology + ",dataEncoding=" + this.dataEncoding + ",utf8String=" + this.utf8String + ",gs1DataCarrier=" + this.gs1DataCarrier + ",compositeFlag=" + this.compositeFlag + ",frameId=" + this.frameId + ",symbolCount=" + this.symbolCount + ",colorInverted=" + this.colorInverted + ",data=" + this.data + ",addOnData=" + this.addOnData + ",compositeData=" + this.compositeData + ",compositeRawData=" + this.compositeRawData + ",structuredAppend=" + this.structuredAppend + ",location=" + this.location + ",pixelsPerComponent=" + this.pixelsPerComponent + ",globalId=" + this.globalId + ",uniqueHash=" + this.uniqueHash + "}";
    }

    public NativeBarcodeRecord(Symbology symbology, ArrayList<EncodingRange> arrayList, String str, boolean z10, CompositeFlag compositeFlag, int i10, int i11, boolean z11, byte[] bArr, String str2, String str3, byte[] bArr2, boolean z12, Quadrilateral quadrilateral, float f10, Integer num, String str4) {
        this.symbology = symbology;
        this.dataEncoding = arrayList;
        this.utf8String = str;
        this.gs1DataCarrier = z10;
        this.compositeFlag = compositeFlag;
        this.frameId = i10;
        this.symbolCount = i11;
        this.colorInverted = z11;
        this.data = bArr;
        this.addOnData = str2;
        this.compositeData = str3;
        this.compositeRawData = bArr2;
        this.structuredAppend = z12;
        this.location = quadrilateral;
        this.pixelsPerComponent = f10;
        this.globalId = num;
        this.uniqueHash = str4;
    }
}
