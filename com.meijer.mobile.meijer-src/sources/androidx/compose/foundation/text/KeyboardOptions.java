package androidx.compose.foundation.text;

import B1.LocaleList;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.a;
import androidx.compose.ui.text.input.b;
import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0007\u0018\u0000 62\u00020\u0001:\u0001 BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J^\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010\u001cR\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010\u001cR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u00100R\u001a\u00102\u001a\u00020\u00028BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b*\u0010\u001cR\u001a\u00104\u001a\u00020\u00068BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b3\u0010\u001cR\u0014\u00105\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010/R\u001a\u00107\u001a\u00020\b8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b6\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/foundation/text/A;", "", "Landroidx/compose/ui/text/input/b;", "capitalization", "", "autoCorrectEnabled", "Landroidx/compose/ui/text/input/KeyboardType;", "keyboardType", "Landroidx/compose/ui/text/input/a;", "imeAction", "Lz1/H;", "platformImeOptions", "showKeyboardOnFocus", "LB1/e;", "hintLocales", "<init>", "(ILjava/lang/Boolean;IILz1/H;Ljava/lang/Boolean;LB1/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "singleLine", "Landroidx/compose/ui/text/input/ImeOptions;", "i", "(Z)Landroidx/compose/ui/text/input/ImeOptions;", "b", "(ILjava/lang/Boolean;IILz1/H;Ljava/lang/Boolean;LB1/e;)Landroidx/compose/foundation/text/A;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "getCapitalization-IUNYP9k", "Ljava/lang/Boolean;", "getAutoCorrectEnabled", "()Ljava/lang/Boolean;", "c", "getKeyboardType-PjHm6EE", "d", "getImeAction-eUduSuo", "e", "getShowKeyboardOnFocus", "f", "LB1/e;", "getHintLocales", "()LB1/e;", "()Z", "autoCorrectOrDefault", "capitalizationOrDefault", "h", "keyboardTypeOrDefault", "hintLocalesOrDefault", "g", "imeActionOrDefault", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.text.A, reason: from toString */
/* loaded from: classes.dex */
public final class KeyboardOptions {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    private static final KeyboardOptions f49199h = new KeyboardOptions(0, null, 0, 0, null, null, null, l3.f93324d, null);

    /* renamed from: i, reason: collision with root package name */
    private static final KeyboardOptions f49200i = new KeyboardOptions(0, Boolean.FALSE, KeyboardType.INSTANCE.f(), 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 121, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int capitalization;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean autoCorrectEnabled;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int keyboardType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int imeAction;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean showKeyboardOnFocus;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocaleList hintLocales;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/A$a;", "", "<init>", "()V", "Landroidx/compose/foundation/text/A;", "Default", "Landroidx/compose/foundation/text/A;", "a", "()Landroidx/compose/foundation/text/A;", "getDefault$annotations", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.A$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KeyboardOptions a() {
            return KeyboardOptions.f49199h;
        }
    }

    public /* synthetic */ KeyboardOptions(int i10, Boolean bool, int i11, int i12, z1.H h10, Boolean bool2, LocaleList localeList, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, bool, i11, i12, h10, bool2, localeList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) other;
        if (!androidx.compose.ui.text.input.b.i(this.capitalization, keyboardOptions.capitalization) || !Intrinsics.e(this.autoCorrectEnabled, keyboardOptions.autoCorrectEnabled) || !KeyboardType.n(this.keyboardType, keyboardOptions.keyboardType) || !androidx.compose.ui.text.input.a.m(this.imeAction, keyboardOptions.imeAction)) {
            return false;
        }
        keyboardOptions.getClass();
        return Intrinsics.e(null, null) && Intrinsics.e(this.showKeyboardOnFocus, keyboardOptions.showKeyboardOnFocus) && Intrinsics.e(this.hintLocales, keyboardOptions.hintLocales);
    }

    private KeyboardOptions(int i10, Boolean bool, int i11, int i12, z1.H h10, Boolean bool2, LocaleList localeList) {
        this.capitalization = i10;
        this.autoCorrectEnabled = bool;
        this.keyboardType = i11;
        this.imeAction = i12;
        this.showKeyboardOnFocus = bool2;
        this.hintLocales = localeList;
    }

    public static /* synthetic */ KeyboardOptions c(KeyboardOptions keyboardOptions, int i10, Boolean bool, int i11, int i12, z1.H h10, Boolean bool2, LocaleList localeList, int i13, Object obj) {
        LocaleList localeList2;
        Boolean bool3;
        int i14;
        z1.H h11;
        Boolean bool4;
        int i15;
        KeyboardOptions keyboardOptions2;
        int i16;
        if ((i13 & 1) != 0) {
            i10 = keyboardOptions.capitalization;
        }
        if ((i13 & 2) != 0) {
            bool = keyboardOptions.autoCorrectEnabled;
        }
        if ((i13 & 4) != 0) {
            i11 = keyboardOptions.keyboardType;
        }
        if ((i13 & 8) != 0) {
            i12 = keyboardOptions.imeAction;
        }
        if ((i13 & 16) != 0) {
            keyboardOptions.getClass();
            h10 = null;
        }
        if ((i13 & 32) != 0) {
            bool2 = null;
        }
        if ((i13 & 64) != 0) {
            localeList2 = null;
            h11 = h10;
            bool3 = bool2;
            i15 = i11;
            i14 = i12;
            i16 = i10;
            bool4 = bool;
            keyboardOptions2 = keyboardOptions;
        } else {
            localeList2 = localeList;
            bool3 = bool2;
            i14 = i12;
            h11 = h10;
            bool4 = bool;
            i15 = i11;
            keyboardOptions2 = keyboardOptions;
            i16 = i10;
        }
        return keyboardOptions2.b(i16, bool4, i15, i14, h11, bool3, localeList2);
    }

    private final boolean d() {
        Boolean bool = this.autoCorrectEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final int e() {
        androidx.compose.ui.text.input.b bVarF = androidx.compose.ui.text.input.b.f(this.capitalization);
        int value = bVarF.getValue();
        b.Companion companion = androidx.compose.ui.text.input.b.INSTANCE;
        if (androidx.compose.ui.text.input.b.i(value, companion.d())) {
            bVarF = null;
        }
        return bVarF != null ? bVarF.getValue() : companion.b();
    }

    private final LocaleList f() {
        LocaleList localeList = this.hintLocales;
        return localeList == null ? LocaleList.INSTANCE.b() : localeList;
    }

    private final int h() {
        KeyboardType keyboardTypeK = KeyboardType.k(this.keyboardType);
        int value = keyboardTypeK.getValue();
        KeyboardType.Companion companion = KeyboardType.INSTANCE;
        if (KeyboardType.n(value, companion.i())) {
            keyboardTypeK = null;
        }
        return keyboardTypeK != null ? keyboardTypeK.getValue() : companion.h();
    }

    public final KeyboardOptions b(int capitalization, Boolean autoCorrectEnabled, int keyboardType, int imeAction, z1.H platformImeOptions, Boolean showKeyboardOnFocus, LocaleList hintLocales) {
        return new KeyboardOptions(capitalization, autoCorrectEnabled, keyboardType, imeAction, platformImeOptions, showKeyboardOnFocus, hintLocales, null);
    }

    public final int g() {
        androidx.compose.ui.text.input.a aVarJ = androidx.compose.ui.text.input.a.j(this.imeAction);
        int value = aVarJ.getValue();
        a.Companion companion = androidx.compose.ui.text.input.a.INSTANCE;
        if (androidx.compose.ui.text.input.a.m(value, companion.i())) {
            aVarJ = null;
        }
        return aVarJ != null ? aVarJ.getValue() : companion.a();
    }

    public int hashCode() {
        int iJ = androidx.compose.ui.text.input.b.j(this.capitalization) * 31;
        Boolean bool = this.autoCorrectEnabled;
        int iHashCode = (((((iJ + (bool != null ? bool.hashCode() : 0)) * 31) + KeyboardType.o(this.keyboardType)) * 31) + androidx.compose.ui.text.input.a.n(this.imeAction)) * 961;
        Boolean bool2 = this.showKeyboardOnFocus;
        int iHashCode2 = (iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        LocaleList localeList = this.hintLocales;
        return iHashCode2 + (localeList != null ? localeList.hashCode() : 0);
    }

    public final ImeOptions i(boolean singleLine) {
        return new ImeOptions(singleLine, e(), d(), h(), g(), null, f(), null);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) androidx.compose.ui.text.input.b.k(this.capitalization)) + ", autoCorrectEnabled=" + this.autoCorrectEnabled + ", keyboardType=" + ((Object) KeyboardType.p(this.keyboardType)) + ", imeAction=" + ((Object) androidx.compose.ui.text.input.a.o(this.imeAction)) + ", platformImeOptions=" + ((Object) null) + "showKeyboardOnFocus=" + this.showKeyboardOnFocus + ", hintLocales=" + this.hintLocales + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KeyboardOptions(int i10, Boolean bool, int i11, int i12, z1.H h10, Boolean bool2, LocaleList localeList, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int iD = (i13 & 1) != 0 ? androidx.compose.ui.text.input.b.INSTANCE.d() : i10;
        Boolean bool3 = (i13 & 2) != 0 ? null : bool;
        int i14 = (i13 & 4) != 0 ? KeyboardType.INSTANCE.i() : i11;
        int i15 = (i13 & 8) != 0 ? androidx.compose.ui.text.input.a.INSTANCE.i() : i12;
        z1.H h11 = (i13 & 16) != 0 ? null : h10;
        Boolean bool4 = (i13 & 32) != 0 ? null : bool2;
        this(iD, bool3, i14, i15, h11, bool4, (i13 & 64) == 0 ? localeList : null, null);
    }
}
