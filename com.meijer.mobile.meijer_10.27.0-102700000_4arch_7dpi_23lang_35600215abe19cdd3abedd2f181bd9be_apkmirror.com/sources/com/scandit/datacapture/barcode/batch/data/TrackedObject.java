package com.scandit.datacapture.barcode.batch.data;

import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedObject;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0013\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0014\u001a\u00020\u0006H\u0097\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/data/TrackedObject;", "Lcom/scandit/datacapture/barcode/batch/data/TrackedObjectProxy;", "impl", "Lcom/scandit/datacapture/barcode/batch/internal/module/data/NativeTrackedObject;", "(Lcom/scandit/datacapture/barcode/batch/internal/module/data/NativeTrackedObject;)V", "data", "", "getData", "()Ljava/lang/String;", "identifier", "", "getIdentifier", "()I", "location", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "getLocation", "()Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "locationIgnoringLicense", "getLocationIgnoringLicense$scandit_barcode_capture", "_impl", "toJson", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TrackedObject implements TrackedObjectProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TrackedObjectProxyAdapter f120472a;

    @Override // com.scandit.datacapture.barcode.batch.data.TrackedObjectProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeTrackedObject getF120473a() {
        return this.f120472a.getF120473a();
    }

    @Override // com.scandit.datacapture.barcode.batch.data.TrackedObjectProxy
    @ProxyFunction(nativeName = "getUtf8String", property = "data")
    public String getData() {
        return this.f120472a.getData();
    }

    @Override // com.scandit.datacapture.barcode.batch.data.TrackedObjectProxy
    @ProxyFunction(property = "identifier")
    public int getIdentifier() {
        return this.f120472a.getIdentifier();
    }

    @Override // com.scandit.datacapture.barcode.batch.data.TrackedObjectProxy
    @ProxyFunction(property = "location")
    public Quadrilateral getLocation() {
        return this.f120472a.getLocation();
    }

    @Override // com.scandit.datacapture.barcode.batch.data.TrackedObjectProxy
    @ProxyFunction
    public String toJson() {
        return this.f120472a.toJson();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrackedObject(NativeTrackedObject impl) {
        Intrinsics.j(impl, "impl");
        this.f120472a = new TrackedObjectProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    public final /* synthetic */ Quadrilateral getLocationIgnoringLicense$scandit_barcode_capture() {
        Quadrilateral locationIgnoringLicense = getF120473a().getLocationIgnoringLicense();
        Intrinsics.i(locationIgnoringLicense, "getLocationIgnoringLicense(...)");
        return locationIgnoringLicense;
    }
}
