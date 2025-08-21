package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0081@\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0015B1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001a\u0088\u0001\u000b\u0092\u0001\u00020\n¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/text/G;", "", "", "canCopy", "canPaste", "canCut", "canSelectAll", "canAutofill", "d", "(ZZZZZ)I", "", "value", "c", "(I)I", "", "k", "(I)Ljava/lang/String;", "j", "other", "e", "(ILjava/lang/Object;)Z", "a", "I", "getValue", "()I", "f", "(I)Z", "h", "g", "i", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class G {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f49448c = c(0);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/text/G$a;", "", "<init>", "()V", "Landroidx/compose/foundation/text/G;", "None", "I", "a", "()I", "", "AUTO_FILL", "COPY", "CUT", "NONE", "PASTE", "SELECT_ALL", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.G$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int a() {
            return G.f49448c;
        }
    }

    public static final /* synthetic */ G b(int i10) {
        return new G(i10);
    }

    private static int c(int i10) {
        return i10;
    }

    public static int d(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return c((z10 ? 1 : 0) | (z11 ? 2 : 0) | (z12 ? 4 : 0) | (z13 ? 8 : 0) | (z14 ? 16 : 0));
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof G) && i10 == ((G) obj).getValue();
    }

    public static final boolean f(int i10) {
        return (i10 & 1) == 1;
    }

    public static final boolean g(int i10) {
        return (i10 & 4) == 4;
    }

    public static final boolean h(int i10) {
        return (i10 & 2) == 2;
    }

    public static final boolean i(int i10) {
        return (i10 & 8) == 8;
    }

    public static int j(int i10) {
        return Integer.hashCode(i10);
    }

    public static String k(int i10) {
        return "MenuItemsAvailability(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.value, obj);
    }

    public int hashCode() {
        return j(this.value);
    }

    /* renamed from: l, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return k(this.value);
    }

    private /* synthetic */ G(int i10) {
        this.value = i10;
    }
}
