package a5;

import a5.c;
import android.graphics.Bitmap;
import d5.C13624h;
import d5.InterfaceC13626j;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import m5.C15667f;
import m5.C15669h;
import m5.C15673l;
import m5.C15677p;
import n5.Size;
import q5.InterfaceC16606c;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 22\u00020\u0001:\u00020\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0012\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\"\u0010#J1\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010$H\u0017¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020'H\u0017¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020'H\u0017¢\u0006\u0004\b*\u0010)J\u001f\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0017¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0017¢\u0006\u0004\b/\u0010.J\u0017\u00100\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b0\u0010\u0006J\u001f\u00102\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u000201H\u0017¢\u0006\u0004\b2\u00103J\u001f\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u000204H\u0017¢\u0006\u0004\b5\u00106ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00067À\u0006\u0003"}, d2 = {"La5/c;", "Lm5/h$b;", "Lm5/h;", "request", "", "b", "(Lm5/h;)V", "n", "Ln5/i;", "size", "h", "(Lm5/h;Ln5/i;)V", "", "input", "i", "(Lm5/h;Ljava/lang/Object;)V", "output", "q", "g", "", "k", "(Lm5/h;Ljava/lang/String;)V", "Lg5/i;", "fetcher", "Lm5/l;", "options", "p", "(Lm5/h;Lg5/i;Lm5/l;)V", "Lg5/h;", "result", "j", "(Lm5/h;Lg5/i;Lm5/l;Lg5/h;)V", "Ld5/j;", "decoder", "l", "(Lm5/h;Ld5/j;Lm5/l;)V", "Ld5/h;", "f", "(Lm5/h;Ld5/j;Lm5/l;Ld5/h;)V", "Landroid/graphics/Bitmap;", "o", "(Lm5/h;Landroid/graphics/Bitmap;)V", "e", "Lq5/c;", "transition", "r", "(Lm5/h;Lq5/c;)V", "m", "c", "Lm5/f;", "a", "(Lm5/h;Lm5/f;)V", "Lm5/p;", "d", "(Lm5/h;Lm5/p;)V", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface c extends C15669h.b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f45169a;

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final c f45168b = new a();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"La5/c$c;", "", "Lm5/h;", "request", "La5/c;", "b", "(Lm5/h;)La5/c;", "a", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: a5.c$c, reason: collision with other inner class name */
    public interface InterfaceC0941c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = Companion.f45172a;

        /* renamed from: b, reason: collision with root package name */
        @JvmField
        public static final InterfaceC0941c f45171b = new InterfaceC0941c() { // from class: a5.d
            @Override // a5.c.InterfaceC0941c
            public final c b(C15669h c15669h) {
                return c.InterfaceC0941c.a(c15669h);
            }
        };

        c b(C15669h request);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"La5/c$c$a;", "", "<init>", "()V", "La5/c$c;", "NONE", "La5/c$c;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: a5.c$c$a, reason: from kotlin metadata */
        public static final class Companion {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ Companion f45172a = new Companion();

            private Companion() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        static c a(C15669h c15669h) {
            return c.f45168b;
        }
    }

    @Override // m5.C15669h.b
    default void a(C15669h request, C15667f result) {
    }

    @Override // m5.C15669h.b
    default void b(C15669h request) {
    }

    @Override // m5.C15669h.b
    default void c(C15669h request) {
    }

    @Override // m5.C15669h.b
    default void d(C15669h request, C15677p result) {
    }

    default void e(C15669h request, Bitmap output) {
    }

    default void f(C15669h request, InterfaceC13626j decoder, C15673l options, C13624h result) {
    }

    default void g(C15669h request, Object input) {
    }

    default void h(C15669h request, Size size) {
    }

    default void i(C15669h request, Object input) {
    }

    default void j(C15669h request, g5.i fetcher, C15673l options, g5.h result) {
    }

    default void k(C15669h request, String output) {
    }

    default void l(C15669h request, InterfaceC13626j decoder, C15673l options) {
    }

    default void m(C15669h request, InterfaceC16606c transition) {
    }

    default void n(C15669h request) {
    }

    default void o(C15669h request, Bitmap input) {
    }

    default void p(C15669h request, g5.i fetcher, C15673l options) {
    }

    default void q(C15669h request, Object output) {
    }

    default void r(C15669h request, InterfaceC16606c transition) {
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"a5/c$a", "La5/c;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements c {
        a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"La5/c$b;", "", "<init>", "()V", "La5/c;", "NONE", "La5/c;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: a5.c$b, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f45169a = new Companion();

        private Companion() {
        }
    }
}
