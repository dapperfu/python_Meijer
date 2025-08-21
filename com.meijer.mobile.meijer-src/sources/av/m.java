package av;

import io.reactivex.s;
import java.io.Serializable;

/* loaded from: classes10.dex */
public enum m {
    COMPLETE;

    static final class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Ju.b f59699a;

        public String toString() {
            return "NotificationLite.Disposable[" + this.f59699a + "]";
        }

        a(Ju.b bVar) {
            this.f59699a = bVar;
        }
    }

    static final class b implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Throwable f59700a;

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return Nu.b.c(this.f59700a, ((b) obj).f59700a);
            }
            return false;
        }

        public int hashCode() {
            return this.f59700a.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f59700a + "]";
        }

        b(Throwable th2) {
            this.f59700a = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T p(Object obj) {
        return obj;
    }

    public static <T> Object z(T t10) {
        return t10;
    }

    public static <T> boolean a(Object obj, s<? super T> sVar) {
        if (obj == COMPLETE) {
            sVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            sVar.onError(((b) obj).f59700a);
            return true;
        }
        sVar.onNext(obj);
        return false;
    }

    public static <T> boolean b(Object obj, s<? super T> sVar) {
        if (obj == COMPLETE) {
            sVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            sVar.onError(((b) obj).f59700a);
            return true;
        }
        if (obj instanceof a) {
            sVar.onSubscribe(((a) obj).f59699a);
            return false;
        }
        sVar.onNext(obj);
        return false;
    }

    public static Object e() {
        return COMPLETE;
    }

    public static Object l(Ju.b bVar) {
        return new a(bVar);
    }

    public static Object m(Throwable th2) {
        return new b(th2);
    }

    public static Throwable o(Object obj) {
        return ((b) obj).f59700a;
    }

    public static boolean t(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean u(Object obj) {
        return obj instanceof b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }
}
