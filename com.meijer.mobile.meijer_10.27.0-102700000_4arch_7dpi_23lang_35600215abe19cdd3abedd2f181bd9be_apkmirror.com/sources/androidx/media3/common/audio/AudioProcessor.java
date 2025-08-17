package androidx.media3.common.audio;

import a3.t;
import d3.P;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;

/* loaded from: classes.dex */
public interface AudioProcessor {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f55341a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledAudioFormatException extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final a f55342a;

        public UnhandledAudioFormatException(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public UnhandledAudioFormatException(String str, a aVar) {
            super(str + " " + aVar);
            this.f55342a = aVar;
        }
    }

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f55343e = new a(-1, -1, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f55344a;

        /* renamed from: b, reason: collision with root package name */
        public final int f55345b;

        /* renamed from: c, reason: collision with root package name */
        public final int f55346c;

        /* renamed from: d, reason: collision with root package name */
        public final int f55347d;

        public a(t tVar) {
            this(tVar.f43925F, tVar.f43924E, tVar.f43926G);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f55344a == aVar.f55344a && this.f55345b == aVar.f55345b && this.f55346c == aVar.f55346c;
        }

        public a(int i10, int i11, int i12) {
            this.f55344a = i10;
            this.f55345b = i11;
            this.f55346c = i12;
            this.f55347d = P.C0(i12) ? P.g0(i12, i11) : -1;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f55344a), Integer.valueOf(this.f55345b), Integer.valueOf(this.f55346c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f55344a + ", channelCount=" + this.f55345b + ", encoding=" + this.f55346c + ']';
        }
    }

    boolean a();

    boolean c();

    ByteBuffer d();

    void e(ByteBuffer byteBuffer);

    void f();

    void flush();

    a g(a aVar) throws UnhandledAudioFormatException;

    void reset();
}
