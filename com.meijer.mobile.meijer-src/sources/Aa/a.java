package Aa;

import D9.ResponseModel;
import H9.l;
import j9.DeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LAa/a;", "LD9/a;", "Lj9/c;", "deviceInfo", "LH9/l;", "", "deviceInfoPayloadStorage", "<init>", "(Lj9/c;LH9/l;)V", "LD9/c;", "responseModel", "", "c", "(LD9/c;)Z", "", "a", "(LD9/c;)V", "Lj9/c;", "b", "LH9/l;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends D9.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final DeviceInfo deviceInfo;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l<String> deviceInfoPayloadStorage;

    public a(DeviceInfo deviceInfo, l<String> deviceInfoPayloadStorage) {
        Intrinsics.j(deviceInfo, "deviceInfo");
        Intrinsics.j(deviceInfoPayloadStorage, "deviceInfoPayloadStorage");
        this.deviceInfo = deviceInfo;
        this.deviceInfoPayloadStorage = deviceInfoPayloadStorage;
    }

    @Override // D9.a
    public void a(ResponseModel responseModel) {
        Intrinsics.j(responseModel, "responseModel");
        this.deviceInfoPayloadStorage.set(this.deviceInfo.c());
    }

    @Override // D9.a
    public boolean c(ResponseModel responseModel) {
        Intrinsics.j(responseModel, "responseModel");
        String string = responseModel.getRequestModel().getUrl().toString();
        Intrinsics.i(string, "toString(...)");
        return StringsKt.W(string, "https://me-client.eservice.emarsys.net", false, 2, null) && StringsKt.G(string, "/client", false, 2, null);
    }
}
