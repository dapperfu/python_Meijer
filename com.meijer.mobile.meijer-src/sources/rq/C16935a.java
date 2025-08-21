package rq;

import com.medallia.digital.mobilesdk.MDExternalError;
import com.medallia.digital.mobilesdk.MDResultCallback;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrq/a;", "", "<init>", "()V", "", "storeName", "", "a", "(Ljava/lang/String;)V", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rq.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C16935a {

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"rq/a$b", "Lcom/medallia/digital/mobilesdk/MDResultCallback;", "", "onSuccess", "()V", "Lcom/medallia/digital/mobilesdk/MDExternalError;", "error", "onError", "(Lcom/medallia/digital/mobilesdk/MDExternalError;)V", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rq.a$b */
    public static final class b implements MDResultCallback {
        @Override // com.medallia.digital.mobilesdk.MDResultCallback
        public void onError(MDExternalError error) {
            Intrinsics.j(error, "error");
            qw.a.INSTANCE.d(error.getMessage(), new Object[0]);
        }

        @Override // com.medallia.digital.mobilesdk.MDResultCallback
        public void onSuccess() {
            qw.a.INSTANCE.a("Success Showing Medallia Form", new Object[0]);
        }

        b() {
        }
    }

    public final void a(String storeName) {
        Intrinsics.j(storeName, "storeName");
        MedalliaDigital.setCustomParameter("HOME_STORE_NAME", storeName);
        MedalliaDigital.showForm("9234", new b());
    }
}
