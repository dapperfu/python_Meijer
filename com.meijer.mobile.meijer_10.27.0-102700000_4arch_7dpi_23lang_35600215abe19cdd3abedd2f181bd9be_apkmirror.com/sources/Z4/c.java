package Z4;

import Z4.c;
import android.graphics.Bitmap;
import c5.C6362h;
import c5.InterfaceC6364j;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import l5.C15370f;
import l5.C15372h;
import l5.C15376l;
import l5.C15380p;
import m5.Size;
import p5.InterfaceC16261c;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 02\u00020\u0001:\u000225J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0012\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\"\u0010#J1\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010$H\u0017¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020'H\u0017¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020'H\u0017¢\u0006\u0004\b*\u0010)J\u001f\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0017¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0017¢\u0006\u0004\b/\u0010.J\u0017\u00100\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b0\u0010\u0006J\u001f\u00102\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u000201H\u0017¢\u0006\u0004\b2\u00103J\u001f\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u000204H\u0017¢\u0006\u0004\b5\u00106ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00067À\u0006\u0003"}, d2 = {"LZ4/c;", "Ll5/h$b;", "Ll5/h;", "request", "", "d", "(Ll5/h;)V", "q", "Lm5/i;", "size", "i", "(Ll5/h;Lm5/i;)V", "", "input", "h", "(Ll5/h;Ljava/lang/Object;)V", "output", "e", "n", "", "f", "(Ll5/h;Ljava/lang/String;)V", "Lf5/i;", "fetcher", "Ll5/l;", "options", "r", "(Ll5/h;Lf5/i;Ll5/l;)V", "Lf5/h;", "result", "k", "(Ll5/h;Lf5/i;Ll5/l;Lf5/h;)V", "Lc5/j;", "decoder", "p", "(Ll5/h;Lc5/j;Ll5/l;)V", "Lc5/h;", "g", "(Ll5/h;Lc5/j;Ll5/l;Lc5/h;)V", "Landroid/graphics/Bitmap;", "j", "(Ll5/h;Landroid/graphics/Bitmap;)V", "l", "Lp5/c;", "transition", "m", "(Ll5/h;Lp5/c;)V", "o", "a", "Ll5/f;", "c", "(Ll5/h;Ll5/f;)V", "Ll5/p;", "b", "(Ll5/h;Ll5/p;)V", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface c extends C15372h.b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f42298a;

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final c f42297b = new a();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"LZ4/c$c;", "", "Ll5/h;", "request", "LZ4/c;", "b", "(Ll5/h;)LZ4/c;", "a", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Z4.c$c, reason: collision with other inner class name */
    public interface InterfaceC0896c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = Companion.f42301a;

        /* renamed from: b, reason: collision with root package name */
        @JvmField
        public static final InterfaceC0896c f42300b = new InterfaceC0896c() { // from class: Z4.d
            @Override // Z4.c.InterfaceC0896c
            public final c b(C15372h c15372h) {
                return c.InterfaceC0896c.a(c15372h);
            }
        };

        c b(C15372h request);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"LZ4/c$c$a;", "", "<init>", "()V", "LZ4/c$c;", "NONE", "LZ4/c$c;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: Z4.c$c$a, reason: from kotlin metadata */
        public static final class Companion {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ Companion f42301a = new Companion();

            private Companion() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        static c a(C15372h c15372h) {
            return c.f42297b;
        }
    }

    @Override // l5.C15372h.b
    default void a(C15372h request) {
    }

    @Override // l5.C15372h.b
    default void b(C15372h request, C15380p result) {
    }

    @Override // l5.C15372h.b
    default void c(C15372h request, C15370f result) {
    }

    @Override // l5.C15372h.b
    default void d(C15372h request) {
    }

    default void e(C15372h request, Object output) {
    }

    default void f(C15372h request, String output) {
    }

    default void g(C15372h request, InterfaceC6364j decoder, C15376l options, C6362h result) {
    }

    default void h(C15372h request, Object input) {
    }

    default void i(C15372h request, Size size) {
    }

    default void j(C15372h request, Bitmap input) {
    }

    default void k(C15372h request, f5.i fetcher, C15376l options, f5.h result) {
    }

    default void l(C15372h request, Bitmap output) {
    }

    default void m(C15372h request, InterfaceC16261c transition) {
    }

    default void n(C15372h request, Object input) {
    }

    default void o(C15372h request, InterfaceC16261c transition) {
    }

    default void p(C15372h request, InterfaceC6364j decoder, C15376l options) {
    }

    default void q(C15372h request) {
    }

    default void r(C15372h request, f5.i fetcher, C15376l options) {
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Z4/c$a", "LZ4/c;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements c {
        a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"LZ4/c$b;", "", "<init>", "()V", "LZ4/c;", "NONE", "LZ4/c;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Z4.c$b, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f42298a = new Companion();

        private Companion() {
        }
    }
}
