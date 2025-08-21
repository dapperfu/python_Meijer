package androidx.media3.exoplayer.audio;

import a3.C5643A;
import a3.C5647d;
import a3.C5650g;
import a3.t;
import android.media.AudioDeviceInfo;
import d3.InterfaceC13606h;
import i3.E1;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface AudioSink {

    public static final class UnexpectedDiscontinuityException extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final long f55984a;

        /* renamed from: b, reason: collision with root package name */
        public final long f55985b;

        public UnexpectedDiscontinuityException(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f55984a = j10;
            this.f55985b = j11;
        }
    }

    public static final class WriteException extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f55986a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f55987b;

        /* renamed from: c, reason: collision with root package name */
        public final t f55988c;

        public WriteException(int i10, t tVar, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f55987b = z10;
            this.f55986a = i10;
            this.f55988c = tVar;
        }
    }

    public interface b {
        default void a(a aVar) {
        }

        default void b(a aVar) {
        }

        void c(boolean z10);

        default void d(Exception exc) {
        }

        default void e(long j10) {
        }

        default void f() {
        }

        default void g() {
        }

        void h(int i10, long j10, long j11);

        default void i() {
        }

        void j();

        default void k() {
        }
    }

    boolean a(t tVar);

    boolean b();

    boolean c();

    void d(C5643A c5643a);

    void e(int i10);

    C5643A f();

    void flush();

    void g(b bVar);

    void h(float f10);

    void i();

    default void j(int i10) {
    }

    void k();

    void l(t tVar, int i10, int[] iArr) throws ConfigurationException;

    default void m(E1 e12) {
    }

    default void n(InterfaceC13606h interfaceC13606h) {
    }

    boolean o(ByteBuffer byteBuffer, long j10, int i10) throws WriteException, InitializationException;

    int p(t tVar);

    void pause();

    void q() throws WriteException;

    default void r(int i10, int i11) {
    }

    default void release() {
    }

    void reset();

    void s(C5647d c5647d);

    default void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
    }

    long t(boolean z10);

    default void u(long j10) {
    }

    void v();

    void w(C5650g c5650g);

    void x();

    void z(boolean z10);

    public static final class ConfigurationException extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final t f55980a;

        public ConfigurationException(Throwable th2, t tVar) {
            super(th2);
            this.f55980a = tVar;
        }

        public ConfigurationException(String str, t tVar) {
            super(str);
            this.f55980a = tVar;
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f55989a;

        /* renamed from: b, reason: collision with root package name */
        public final int f55990b;

        /* renamed from: c, reason: collision with root package name */
        public final int f55991c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f55992d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f55993e;

        /* renamed from: f, reason: collision with root package name */
        public final int f55994f;

        public a(int i10, int i11, int i12, boolean z10, boolean z11, int i13) {
            this.f55989a = i10;
            this.f55990b = i11;
            this.f55991c = i12;
            this.f55992d = z10;
            this.f55993e = z11;
            this.f55994f = i13;
        }
    }

    default d y(t tVar) {
        return d.f56130d;
    }

    public static final class InitializationException extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f55981a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f55982b;

        /* renamed from: c, reason: collision with root package name */
        public final t f55983c;

        public InitializationException(String str, int i10, t tVar, boolean z10, Throwable th2) {
            super(str, th2);
            this.f55981a = i10;
            this.f55982b = z10;
            this.f55983c = tVar;
        }

        public InitializationException(int i10, int i11, int i12, int i13, t tVar, boolean z10, Exception exc) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AudioTrack init failed ");
            sb2.append(i10);
            sb2.append(" ");
            sb2.append("Config(");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(i12);
            sb2.append(", ");
            sb2.append(i13);
            sb2.append(")");
            sb2.append(" ");
            sb2.append(tVar);
            sb2.append(z10 ? " (recoverable)" : "");
            this(sb2.toString(), i10, tVar, z10, exc);
        }
    }
}
