package Hm;

import com.meijer.mobile.meijer.activity.checkout.payment.ebt.request.AcculynkRequest;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.request.MjrEbtPanDataRequest;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.response.EbtAcculynkResponse;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.response.EbtPanResponse;
import com.squareup.moshi.h;
import com.squareup.moshi.t;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0016\u0010\u000eR\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LHm/e;", "", "<init>", "()V", "", "inputString", "f", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/MjrEbtPanDataRequest;", "jsonString", "e", "(Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/MjrEbtPanDataRequest;)Ljava/lang/String;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkRequest;", "d", "(Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/request/AcculynkRequest;)Ljava/lang/String;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtPanResponse;", "i", "(Ljava/lang/String;)Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtPanResponse;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtAcculynkResponse;", "j", "(Ljava/lang/String;)Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtAcculynkResponse;", "h", "g", "Lcom/squareup/moshi/t;", "b", "Lkotlin/Lazy;", "c", "()Lcom/squareup/moshi/t;", "ebtMoshi", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f13725a = new e();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Lazy ebtMoshi = LazyKt.b(new Function0() { // from class: Hm.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return e.b();
        }
    });

    /* renamed from: c, reason: collision with root package name */
    public static final int f13727c = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final t b() {
        return new t.a().d();
    }

    private final t c() {
        Object value = ebtMoshi.getValue();
        Intrinsics.i(value, "getValue(...)");
        return (t) value;
    }

    private final String f(String inputString) throws UnsupportedEncodingException {
        String strEncode = URLEncoder.encode(inputString, "UTF-8");
        Intrinsics.i(strEncode, "encode(...)");
        return strEncode;
    }

    public final String g(AcculynkRequest jsonString) {
        Intrinsics.j(jsonString, "jsonString");
        return f(d(jsonString));
    }

    public final String h(MjrEbtPanDataRequest jsonString) {
        Intrinsics.j(jsonString, "jsonString");
        return f(e(jsonString));
    }

    public final EbtPanResponse i(String jsonString) {
        Object objB;
        Intrinsics.j(jsonString, "jsonString");
        h hVarC = c().c(EbtPanResponse.class);
        try {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b((EbtPanResponse) hVarC.nonNull().fromJson(jsonString));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            qw.a.INSTANCE.f(thE, "Failed to parse string to EbtPanResponse", new Object[0]);
        }
        if (Result.g(objB)) {
            objB = null;
        }
        return (EbtPanResponse) objB;
    }

    public final EbtAcculynkResponse j(String jsonString) {
        Object objB;
        Intrinsics.j(jsonString, "jsonString");
        h hVarC = c().c(EbtAcculynkResponse.class);
        try {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b((EbtAcculynkResponse) hVarC.nonNull().fromJson(jsonString));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            qw.a.INSTANCE.f(thE, "Failed to parse string to EbtPINPanResponse", new Object[0]);
        }
        if (Result.g(objB)) {
            objB = null;
        }
        return (EbtAcculynkResponse) objB;
    }

    private e() {
    }

    private final String d(AcculynkRequest jsonString) {
        Object objB;
        h hVarC = c().c(AcculynkRequest.class);
        try {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b(hVarC.nonNull().toJson(jsonString));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            qw.a.INSTANCE.f(thE, "Failed to parse EbtPINPadData to string", new Object[0]);
        }
        if (Result.g(objB)) {
            objB = null;
        }
        return (String) objB;
    }

    private final String e(MjrEbtPanDataRequest jsonString) {
        Object objB;
        h hVarC = c().c(MjrEbtPanDataRequest.class);
        try {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b(hVarC.nonNull().toJson(jsonString));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            qw.a.INSTANCE.f(thE, "Failed to parse EbtPanData to string", new Object[0]);
        }
        if (Result.g(objB)) {
            objB = null;
        }
        return (String) objB;
    }
}
