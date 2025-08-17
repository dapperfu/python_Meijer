package x;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final c f166616a;

    private static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final InputConfiguration f166617a;

        @Override // x.j.c
        public Object a() {
            return this.f166617a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return Objects.equals(this.f166617a, ((c) obj).a());
            }
            return false;
        }

        public int hashCode() {
            return this.f166617a.hashCode();
        }

        public String toString() {
            return this.f166617a.toString();
        }

        a(Object obj) {
            this.f166617a = (InputConfiguration) obj;
        }
    }

    private interface c {
        Object a();
    }

    private static final class b extends a {
        b(Object obj) {
            super(obj);
        }
    }

    public static j b(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new j(new b(obj)) : new j(new a(obj));
    }

    public Object a() {
        return this.f166616a.a();
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f166616a.equals(((j) obj).f166616a);
        }
        return false;
    }

    public int hashCode() {
        return this.f166616a.hashCode();
    }

    public String toString() {
        return this.f166616a.toString();
    }

    private j(c cVar) {
        this.f166616a = cVar;
    }
}
