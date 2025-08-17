package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.count.capture.map.BarcodeSpatialGrid;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.data.Cluster;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountSessionCallback;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001BQ\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001bR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0017\u0010+\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001d\u001a\u0004\b-\u0010\u001f¨\u0006/"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSession;", "", "", "Lcom/scandit/datacapture/barcode/data/Barcode;", "recognizedBarcodesParam", "Lcom/scandit/datacapture/barcode/data/Cluster;", "recognizedClustersParam", "additionalBarcodesParam", "", "frameSequenceIdParam", "", "removedRecognizedBarcodes", "Lcom/scandit/datacapture/barcode/internal/module/count/capture/InternalBarcodeCountSessionCallback;", "callbacks", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;JLjava/util/List;Lcom/scandit/datacapture/barcode/internal/module/count/capture/InternalBarcodeCountSessionCallback;)V", "", "reset", "()V", "", "toJson", "()Ljava/lang/String;", "expectedNumberOfRows", "expectedNumberOfColumns", "Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGrid;", "getSpatialMap", "(II)Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGrid;", "()Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGrid;", "b", "Ljava/util/List;", "getRecognizedBarcodes", "()Ljava/util/List;", "recognizedBarcodes", "c", "getRecognizedClusters", "recognizedClusters", "d", "getAdditionalBarcodes", "additionalBarcodes", "e", "J", "getFrameSequenceId", "()J", "frameSequenceId", "f", "get_removedRecognizedBarcodes", "_removedRecognizedBarcodes", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeCountSession {

    /* renamed from: a, reason: collision with root package name */
    private final InternalBarcodeCountSessionCallback f120614a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List recognizedBarcodes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List recognizedClusters;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List additionalBarcodes;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long frameSequenceId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List _removedRecognizedBarcodes;

    public final BarcodeSpatialGrid getSpatialMap(int expectedNumberOfRows, int expectedNumberOfColumns) {
        return (BarcodeSpatialGrid) this.f120614a.a().invoke(Integer.valueOf(expectedNumberOfRows), Integer.valueOf(expectedNumberOfColumns));
    }

    public BarcodeCountSession(List<Barcode> recognizedBarcodesParam, List<Cluster> recognizedClustersParam, List<Barcode> additionalBarcodesParam, long j10, List<Integer> removedRecognizedBarcodes, InternalBarcodeCountSessionCallback callbacks) {
        Intrinsics.j(recognizedBarcodesParam, "recognizedBarcodesParam");
        Intrinsics.j(recognizedClustersParam, "recognizedClustersParam");
        Intrinsics.j(additionalBarcodesParam, "additionalBarcodesParam");
        Intrinsics.j(removedRecognizedBarcodes, "removedRecognizedBarcodes");
        Intrinsics.j(callbacks, "callbacks");
        this.f120614a = callbacks;
        this.recognizedBarcodes = recognizedBarcodesParam;
        this.recognizedClusters = recognizedClustersParam;
        this.additionalBarcodes = additionalBarcodesParam;
        this.frameSequenceId = j10;
        this._removedRecognizedBarcodes = removedRecognizedBarcodes;
    }

    public final List<Barcode> getAdditionalBarcodes() {
        return this.additionalBarcodes;
    }

    public final long getFrameSequenceId() {
        return this.frameSequenceId;
    }

    public final List<Barcode> getRecognizedBarcodes() {
        return this.recognizedBarcodes;
    }

    public final List<Cluster> getRecognizedClusters() {
        return this.recognizedClusters;
    }

    public final BarcodeSpatialGrid getSpatialMap() {
        return (BarcodeSpatialGrid) this.f120614a.a().invoke(null, null);
    }

    public final List<Integer> get_removedRecognizedBarcodes() {
        return this._removedRecognizedBarcodes;
    }

    public final void reset() {
        this.f120614a.b().invoke();
    }

    public final String toJson() {
        return (String) this.f120614a.c().invoke();
    }
}
