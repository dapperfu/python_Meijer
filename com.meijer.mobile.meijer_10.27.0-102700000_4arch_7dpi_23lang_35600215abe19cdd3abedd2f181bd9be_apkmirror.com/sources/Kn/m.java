package Kn;

import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LKn/m;", "", "<init>", "()V", "Lcom/google/firebase/messaging/FirebaseMessaging;", "b", "()Lcom/google/firebase/messaging/FirebaseMessaging;", "Lcom/google/firebase/crashlytics/a;", "a", "()Lcom/google/firebase/crashlytics/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f17430a = new m();

    private m() {
    }

    public final com.google.firebase.crashlytics.a a() {
        com.google.firebase.crashlytics.a aVarB = com.google.firebase.crashlytics.a.b();
        Intrinsics.i(aVarB, "getInstance(...)");
        aVarB.f(true);
        return aVarB;
    }

    public final FirebaseMessaging b() {
        FirebaseMessaging firebaseMessagingN = FirebaseMessaging.n();
        Intrinsics.i(firebaseMessagingN, "getInstance(...)");
        return firebaseMessagingN;
    }
}
