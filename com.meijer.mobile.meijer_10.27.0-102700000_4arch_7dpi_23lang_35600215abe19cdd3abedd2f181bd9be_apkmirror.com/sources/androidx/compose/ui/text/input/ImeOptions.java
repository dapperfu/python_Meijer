package androidx.compose.ui.text.input;

import B1.LocaleList;
import com.fullstory.instrumentation.frameworks.compose.FSComposeImeOptions;
import com.fullstory.instrumentation.frameworks.compose.FSComposeKeyboardType;
import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import z1.H;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\u001aBO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b!\u0010\u0016R\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\"\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/ui/text/input/ImeOptions;", "", "", "singleLine", "Landroidx/compose/ui/text/input/b;", "capitalization", "autoCorrect", "Landroidx/compose/ui/text/input/KeyboardType;", "keyboardType", "Landroidx/compose/ui/text/input/a;", "imeAction", "Lz1/H;", "platformImeOptions", "LB1/e;", "hintLocales", "<init>", "(ZIZIILz1/H;LB1/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Z", "h", "()Z", "b", "I", "c", "f", "d", "e", "LB1/e;", "()LB1/e;", "Lz1/H;", "g", "()Lz1/H;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImeOptions implements FSComposeImeOptions {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    private static final ImeOptions f52487g = new ImeOptions(false, 0, false, 0, 0, null, null, l3.f92485d, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean singleLine;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int capitalization;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean autoCorrect;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int imeAction;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocaleList hintLocales;
    private final int keyboardType;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/input/ImeOptions$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/ImeOptions;", "Default", "Landroidx/compose/ui/text/input/ImeOptions;", "a", "()Landroidx/compose/ui/text/input/ImeOptions;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.input.ImeOptions$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ImeOptions a() {
            return ImeOptions.f52487g;
        }
    }

    public /* synthetic */ ImeOptions(boolean z10, int i10, boolean z11, int i11, int i12, H h10, LocaleList localeList, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, i10, z11, i11, i12, h10, localeList);
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeImeOptions
    public FSComposeKeyboardType _fsGetKeyboardType() {
        return FSComposeKeyboardType.from(this.keyboardType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImeOptions)) {
            return false;
        }
        ImeOptions imeOptions = (ImeOptions) other;
        if (this.singleLine != imeOptions.singleLine || !b.i(this.capitalization, imeOptions.capitalization) || this.autoCorrect != imeOptions.autoCorrect || !KeyboardType.n(this.keyboardType, imeOptions.keyboardType) || !a.m(this.imeAction, imeOptions.imeAction)) {
            return false;
        }
        imeOptions.getClass();
        return Intrinsics.e(null, null) && Intrinsics.e(this.hintLocales, imeOptions.hintLocales);
    }

    public final H g() {
        return null;
    }

    private ImeOptions(boolean z10, int i10, boolean z11, int i11, int i12, H h10, LocaleList localeList) {
        this.singleLine = z10;
        this.capitalization = i10;
        this.autoCorrect = z11;
        this.keyboardType = i11;
        this.imeAction = i12;
        this.hintLocales = localeList;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* renamed from: c, reason: from getter */
    public final int getCapitalization() {
        return this.capitalization;
    }

    /* renamed from: d, reason: from getter */
    public final LocaleList getHintLocales() {
        return this.hintLocales;
    }

    /* renamed from: e, reason: from getter */
    public final int getImeAction() {
        return this.imeAction;
    }

    /* renamed from: f, reason: from getter */
    public final int getKeyboardType() {
        return this.keyboardType;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.singleLine) * 31) + b.j(this.capitalization)) * 31) + Boolean.hashCode(this.autoCorrect)) * 31) + KeyboardType.o(this.keyboardType)) * 31) + a.n(this.imeAction)) * 961) + this.hintLocales.hashCode();
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.singleLine + ", capitalization=" + ((Object) b.k(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) KeyboardType.p(this.keyboardType)) + ", imeAction=" + ((Object) a.o(this.imeAction)) + ", platformImeOptions=" + ((Object) null) + ", hintLocales=" + this.hintLocales + ')';
    }

    public /* synthetic */ ImeOptions(boolean z10, int i10, boolean z11, int i11, int i12, H h10, LocaleList localeList, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? b.INSTANCE.b() : i10, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? KeyboardType.INSTANCE.h() : i11, (i13 & 16) != 0 ? a.INSTANCE.a() : i12, (i13 & 32) != 0 ? null : h10, (i13 & 64) != 0 ? LocaleList.INSTANCE.b() : localeList, null);
    }
}
