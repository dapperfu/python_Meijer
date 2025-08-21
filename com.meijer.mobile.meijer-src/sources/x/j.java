package x;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final c f167704a;

    private static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final InputConfiguration f167705a;

        @Override // x.j.c
        public Object a() {
            return this.f167705a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return Objects.equals(this.f167705a, ((c) obj).a());
            }
            return false;
        }

        public int hashCode() {
            return this.f167705a.hashCode();
        }

        public String toString() {
            return this.f167705a.toString();
        }

        a(Object obj) {
            this.f167705a = (InputConfiguration) obj;
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
        return this.f167704a.a();
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f167704a.equals(((j) obj).f167704a);
        }
        return false;
    }

    public int hashCode() {
        return this.f167704a.hashCode();
    }

    public String toString() {
        return this.f167704a.toString();
    }

    private j(c cVar) {
        this.f167704a = cVar;
    }
}
