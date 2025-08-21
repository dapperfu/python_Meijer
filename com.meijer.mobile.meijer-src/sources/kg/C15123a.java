package kg;

import jg.T;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003R(\u0010\r\u001a\u00020\u00068\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0004\b\u0005\u0010\u0007\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lkg/a;", "", "<init>", "()V", "", "b", "Ljg/T;", "Ljg/T;", "a", "()Ljg/T;", "c", "(Ljg/T;)V", "getSharedSessionRepository$com_google_firebase_firebase_sessions$annotations", "sharedSessionRepository", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: kg.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15123a {

    /* renamed from: a, reason: collision with root package name */
    public static final C15123a f141825a = new C15123a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static T sharedSessionRepository;

    @JvmStatic
    public static final void b() {
        try {
            if (sharedSessionRepository == null) {
                f141825a.c(T.INSTANCE.a());
            }
            C15123a c15123a = f141825a;
            if (c15123a.a().a()) {
                c15123a.a().b();
            }
        } catch (Exception unused) {
        }
    }

    public final T a() {
        T t10 = sharedSessionRepository;
        if (t10 != null) {
            return t10;
        }
        Intrinsics.x("sharedSessionRepository");
        return null;
    }

    public final void c(T t10) {
        Intrinsics.j(t10, "<set-?>");
        sharedSessionRepository = t10;
    }

    private C15123a() {
    }
}
