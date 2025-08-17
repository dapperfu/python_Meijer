package Ji;

import Ji.S;
import Ji.T;
import Ji.V;
import Ji.W;
import P0.e;
import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import d0.C13448o;
import j0.C14802K;
import j0.C14815g;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import ni.N1;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lni/N1;", "theme", "Lkotlin/Function1;", "LJi/M;", "", "Lkotlin/ExtensionFunctionType;", "content", "b", "(Lni/N1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "LH1/h;", "bottomToastPadding", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class K {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bp*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005R\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0005R\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0005R\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0005R\u001a\u0010\u0015\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0005R\u001a\u0010\u0017\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\r\u0010\u0005R \u0010\u001c\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u0005R\u001a\u0010\u001f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0005R\u001a\u0010\"\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0005R\u001a\u0010$\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b\u0010\u0010\u0005R\u001a\u0010'\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0005R\u001a\u0010)\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b(\u0010\u0005R\u001a\u0010,\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010\u0005R\u001a\u0010/\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0005R\u001a\u00102\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010\u0004\u001a\u0004\b1\u0010\u0005R \u00106\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b3\u0010\u0004\u0012\u0004\b5\u0010\u001b\u001a\u0004\b4\u0010\u0005R\u001a\u00108\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R\u001a\u00109\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u0016\u0010\u0005R\u001a\u0010<\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010\u0004\u001a\u0004\b;\u0010\u0005R\u001a\u0010>\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010\u0004\u001a\u0004\b \u0010\u0005R\u001a\u0010@\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b?\u0010\u0005R\u001a\u0010C\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0005R\u001a\u0010F\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010\u0004\u001a\u0004\bE\u0010\u0005R\u001a\u0010G\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\bD\u0010\u0005R\u001a\u0010I\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010\u0004\u001a\u0004\b\n\u0010\u0005R\u001a\u0010L\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010\u0004\u001a\u0004\bK\u0010\u0005R\u001a\u0010O\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010\u0004\u001a\u0004\bN\u0010\u0005R\u001a\u0010Q\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010\u0004\u001a\u0004\b=\u0010\u0005R\u001a\u0010T\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010\u0004\u001a\u0004\bS\u0010\u0005R\u001a\u0010U\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010\u0004\u001a\u0004\b#\u0010\u0005R\u001a\u0010X\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010\u0004\u001a\u0004\bW\u0010\u0005R\u001a\u0010Z\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010\u0004\u001a\u0004\bY\u0010\u0005R\u001a\u0010[\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010\u0004\u001a\u0004\bP\u0010\u0005R\u001a\u0010]\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010\u0004\u001a\u0004\bV\u0010\u0005R\u001a\u0010_\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010\u0004\u001a\u0004\b7\u0010\u0005R\u001a\u0010a\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b`\u0010\u0005R\u001a\u0010b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010\u0004\u001a\u0004\bJ\u0010\u0005R\u001a\u0010c\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010\u0004\u001a\u0004\bH\u0010\u0005R\u001a\u0010d\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010\u0004\u001a\u0004\bA\u0010\u0005R\u001a\u0010e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\u0004\u001a\u0004\b-\u0010\u0005R\u001a\u0010f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b:\u0010\u0005R\u001a\u0010g\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010\u0004\u001a\u0004\bM\u0010\u0005R\u001a\u0010h\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010\u0004\u001a\u0004\bR\u0010\u0005R\u001a\u0010i\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b3\u0010\u0005R \u0010k\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0004\u0012\u0004\bj\u0010\u001b\u001a\u0004\b\\\u0010\u0005R\u001a\u0010l\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010\u0004\u001a\u0004\b\u0018\u0010\u0005R\u001a\u0010m\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b^\u0010\u0005R\u001a\u0010n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010\u0004\u001a\u0004\b0\u0010\u0005R\u001a\u0010o\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b*\u0010\u0005R\u001a\u0010p\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010\u0004\u001a\u0004\b\u001d\u0010\u0005R\u001a\u0010q\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010\u0004\u001a\u0004\b\u0013\u0010\u0005¨\u0006r"}, d2 = {"Ji/K$a", "LJi/z;", "LJi/T;", "a", "LJi/T;", "()LJi/T;", "adsColorBrandPrimary", "b", "K", "adsColorBrandSecondary", "c", "T", "adsColorText01", "d", "P", "adsColorText02", "e", "X", "adsColorText03", "f", "m", "adsColorPlaceholder", "g", "adsColorInteractive04Active", "h", "v", "getAdsColorDisabled$annotations", "()V", "adsColorDisabled", "i", "s", "adsColorsDisabled", "j", "y", "adsColorSavings", "k", "adsColorLink", "l", "S", "adsColorIcon01", "O", "adsColorIcon02", "n", "Z", "adsColorIcon03", "o", "G", "adsColorIconSubtle", "p", "U", "adsColorEnabled01", "q", "getAdsColorEnabled02", "getAdsColorEnabled02$annotations", "adsColorEnabled02", "r", "adsColorsEnabled02", "adsColorTransparent", "t", "V", "adsColorDanger", "u", "adsColorSupportError", "L", "adsColorSupportSuccess", "w", "Y", "adsColorSupportWarning", "x", "H", "adsColorTextHighlight", "adsColorSupportInformational", "z", "adsColorSupportErrorBg", "A", "W", "adsColorSupportSuccessBg", "B", "E", "adsColorSupportWarningBg", "C", "adsColorSupportInformationalBg", "D", "R", "adsColorInverse", "adsColorInteractiveEnabled04", "F", "Q", "adsColorUIBackground01", "N", "adsColorUIBackground02", "adsColorUIBorder01", "I", "adsColorUIBorder02", "J", "adsColorUIDivider", "M", "adsColorUIOverlay", "adsColorFocus", "adsColorHover01", "adsColorHover02", "adsColorHoverTransparent", "adsColorHoverDanger", "adsColorHoverInverse", "adsColorActive01", "adsInteractiveSelected", "getAdsColorActive02$annotations", "adsColorActive02", "adsColorsActive02", "adsColorActiveTransparent", "adsColorActiveDanger", "adsColorActiveInverse", "acresGradientBlueStart", "acresGradientBlueEnd", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements z {

        /* renamed from: A, reason: collision with root package name and from kotlin metadata */
        private final T adsColorSupportSuccessBg;

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final T adsColorSupportWarningBg;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final T adsColorSupportInformationalBg;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private final T adsColorInverse;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private final T adsColorInteractiveEnabled04;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private final T adsColorUIBackground01;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata */
        private final T adsColorUIBackground02;

        /* renamed from: H, reason: collision with root package name and from kotlin metadata */
        private final T adsColorUIBorder01;

        /* renamed from: I, reason: collision with root package name and from kotlin metadata */
        private final T adsColorUIBorder02;

        /* renamed from: J, reason: collision with root package name and from kotlin metadata */
        private final T adsColorUIDivider;

        /* renamed from: K, reason: collision with root package name and from kotlin metadata */
        private final T adsColorUIOverlay;

        /* renamed from: L, reason: collision with root package name and from kotlin metadata */
        private final T adsColorFocus;

        /* renamed from: M, reason: collision with root package name and from kotlin metadata */
        private final T adsColorHover01;

        /* renamed from: N, reason: collision with root package name and from kotlin metadata */
        private final T adsColorHover02;

        /* renamed from: O, reason: collision with root package name and from kotlin metadata */
        private final T adsColorHoverTransparent;

        /* renamed from: P, reason: collision with root package name and from kotlin metadata */
        private final T adsColorHoverDanger;

        /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
        private final T adsColorHoverInverse;

        /* renamed from: R, reason: collision with root package name and from kotlin metadata */
        private final T adsColorActive01;

        /* renamed from: S, reason: collision with root package name and from kotlin metadata */
        private final T adsInteractiveSelected;

        /* renamed from: T, reason: collision with root package name and from kotlin metadata */
        private final T adsColorActive02;

        /* renamed from: U, reason: collision with root package name and from kotlin metadata */
        private final T adsColorsActive02;

        /* renamed from: V, reason: collision with root package name and from kotlin metadata */
        private final T adsColorActiveTransparent;

        /* renamed from: W, reason: collision with root package name and from kotlin metadata */
        private final T adsColorActiveDanger;

        /* renamed from: X, reason: collision with root package name and from kotlin metadata */
        private final T adsColorActiveInverse;

        /* renamed from: Y, reason: collision with root package name and from kotlin metadata */
        private final T acresGradientBlueStart;

        /* renamed from: Z, reason: collision with root package name and from kotlin metadata */
        private final T acresGradientBlueEnd;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final T adsColorBrandPrimary;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final T adsColorBrandSecondary;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final T adsColorText01;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final T adsColorText02;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final T adsColorText03;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final T adsColorPlaceholder;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final T adsColorInteractive04Active;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final T adsColorDisabled;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final T adsColorsDisabled;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final T adsColorSavings;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final T adsColorLink;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final T adsColorIcon01;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final T adsColorIcon02;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final T adsColorIcon03;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final T adsColorIconSubtle;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final T adsColorEnabled01;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final T adsColorEnabled02;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final T adsColorsEnabled02;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private final T adsColorTransparent;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final T adsColorDanger;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        private final T adsColorSupportError;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        private final T adsColorSupportSuccess;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata */
        private final T adsColorSupportWarning;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata */
        private final T adsColorTextHighlight;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata */
        private final T adsColorSupportInformational;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata */
        private final T adsColorSupportErrorBg;

        @Override // Ji.z
        /* renamed from: A, reason: from getter */
        public T getAdsColorFocus() {
            return this.adsColorFocus;
        }

        @Override // Ji.z
        /* renamed from: B, reason: from getter */
        public T getAdsColorHoverInverse() {
            return this.adsColorHoverInverse;
        }

        @Override // Ji.z
        /* renamed from: C, reason: from getter */
        public T getAdsColorUIBorder01() {
            return this.adsColorUIBorder01;
        }

        @Override // Ji.z
        /* renamed from: D, reason: from getter */
        public T getAdsColorActive01() {
            return this.adsColorActive01;
        }

        @Override // Ji.z
        /* renamed from: E, reason: from getter */
        public T getAdsColorSupportWarningBg() {
            return this.adsColorSupportWarningBg;
        }

        @Override // Ji.z
        /* renamed from: F, reason: from getter */
        public T getAdsColorUIBorder02() {
            return this.adsColorUIBorder02;
        }

        @Override // Ji.z
        /* renamed from: G, reason: from getter */
        public T getAdsColorIconSubtle() {
            return this.adsColorIconSubtle;
        }

        @Override // Ji.z
        /* renamed from: H, reason: from getter */
        public T getAdsColorTextHighlight() {
            return this.adsColorTextHighlight;
        }

        @Override // Ji.z
        /* renamed from: I, reason: from getter */
        public T getAdsColorActive02() {
            return this.adsColorActive02;
        }

        @Override // Ji.z
        /* renamed from: J, reason: from getter */
        public T getAdsColorActiveTransparent() {
            return this.adsColorActiveTransparent;
        }

        @Override // Ji.z
        /* renamed from: K, reason: from getter */
        public T getAdsColorBrandSecondary() {
            return this.adsColorBrandSecondary;
        }

        @Override // Ji.z
        /* renamed from: L, reason: from getter */
        public T getAdsColorSupportSuccess() {
            return this.adsColorSupportSuccess;
        }

        @Override // Ji.z
        /* renamed from: M, reason: from getter */
        public T getAdsColorUIOverlay() {
            return this.adsColorUIOverlay;
        }

        @Override // Ji.z
        /* renamed from: N, reason: from getter */
        public T getAdsColorUIBackground02() {
            return this.adsColorUIBackground02;
        }

        @Override // Ji.z
        /* renamed from: O, reason: from getter */
        public T getAdsColorIcon02() {
            return this.adsColorIcon02;
        }

        @Override // Ji.z
        /* renamed from: P, reason: from getter */
        public T getAdsColorText02() {
            return this.adsColorText02;
        }

        @Override // Ji.z
        /* renamed from: Q, reason: from getter */
        public T getAdsColorUIBackground01() {
            return this.adsColorUIBackground01;
        }

        @Override // Ji.z
        /* renamed from: R, reason: from getter */
        public T getAdsColorInverse() {
            return this.adsColorInverse;
        }

        @Override // Ji.z
        /* renamed from: S, reason: from getter */
        public T getAdsColorIcon01() {
            return this.adsColorIcon01;
        }

        @Override // Ji.z
        /* renamed from: T, reason: from getter */
        public T getAdsColorText01() {
            return this.adsColorText01;
        }

        @Override // Ji.z
        /* renamed from: U, reason: from getter */
        public T getAdsColorEnabled01() {
            return this.adsColorEnabled01;
        }

        @Override // Ji.z
        /* renamed from: V, reason: from getter */
        public T getAdsColorDanger() {
            return this.adsColorDanger;
        }

        @Override // Ji.z
        /* renamed from: W, reason: from getter */
        public T getAdsColorSupportSuccessBg() {
            return this.adsColorSupportSuccessBg;
        }

        @Override // Ji.z
        /* renamed from: X, reason: from getter */
        public T getAdsColorText03() {
            return this.adsColorText03;
        }

        @Override // Ji.z
        /* renamed from: Y, reason: from getter */
        public T getAdsColorSupportWarning() {
            return this.adsColorSupportWarning;
        }

        @Override // Ji.z
        /* renamed from: Z, reason: from getter */
        public T getAdsColorIcon03() {
            return this.adsColorIcon03;
        }

        @Override // Ji.z
        /* renamed from: a, reason: from getter */
        public T getAdsColorBrandPrimary() {
            return this.adsColorBrandPrimary;
        }

        @Override // Ji.z
        /* renamed from: b, reason: from getter */
        public T getAdsColorsEnabled02() {
            return this.adsColorsEnabled02;
        }

        @Override // Ji.z
        /* renamed from: c, reason: from getter */
        public T getAdsColorSupportErrorBg() {
            return this.adsColorSupportErrorBg;
        }

        @Override // Ji.z
        /* renamed from: d, reason: from getter */
        public T getAdsColorInteractive04Active() {
            return this.adsColorInteractive04Active;
        }

        @Override // Ji.z
        /* renamed from: e, reason: from getter */
        public T getAdsColorLink() {
            return this.adsColorLink;
        }

        @Override // Ji.z
        /* renamed from: f, reason: from getter */
        public T getAcresGradientBlueEnd() {
            return this.acresGradientBlueEnd;
        }

        @Override // Ji.z
        /* renamed from: g, reason: from getter */
        public T getAdsColorTransparent() {
            return this.adsColorTransparent;
        }

        @Override // Ji.z
        /* renamed from: h, reason: from getter */
        public T getAdsColorsActive02() {
            return this.adsColorsActive02;
        }

        @Override // Ji.z
        /* renamed from: i, reason: from getter */
        public T getAcresGradientBlueStart() {
            return this.acresGradientBlueStart;
        }

        @Override // Ji.z
        /* renamed from: j, reason: from getter */
        public T getAdsColorSupportError() {
            return this.adsColorSupportError;
        }

        @Override // Ji.z
        /* renamed from: k, reason: from getter */
        public T getAdsColorInteractiveEnabled04() {
            return this.adsColorInteractiveEnabled04;
        }

        @Override // Ji.z
        /* renamed from: m, reason: from getter */
        public T getAdsColorPlaceholder() {
            return this.adsColorPlaceholder;
        }

        @Override // Ji.z
        /* renamed from: n, reason: from getter */
        public T getAdsColorActiveInverse() {
            return this.adsColorActiveInverse;
        }

        @Override // Ji.z
        /* renamed from: o, reason: from getter */
        public T getAdsColorHoverTransparent() {
            return this.adsColorHoverTransparent;
        }

        @Override // Ji.z
        /* renamed from: p, reason: from getter */
        public T getAdsColorActiveDanger() {
            return this.adsColorActiveDanger;
        }

        @Override // Ji.z
        /* renamed from: q, reason: from getter */
        public T getAdsInteractiveSelected() {
            return this.adsInteractiveSelected;
        }

        @Override // Ji.z
        /* renamed from: r, reason: from getter */
        public T getAdsColorUIDivider() {
            return this.adsColorUIDivider;
        }

        @Override // Ji.z
        /* renamed from: s, reason: from getter */
        public T getAdsColorsDisabled() {
            return this.adsColorsDisabled;
        }

        @Override // Ji.z
        /* renamed from: t, reason: from getter */
        public T getAdsColorHoverDanger() {
            return this.adsColorHoverDanger;
        }

        @Override // Ji.z
        /* renamed from: u, reason: from getter */
        public T getAdsColorSupportInformationalBg() {
            return this.adsColorSupportInformationalBg;
        }

        @Override // Ji.z
        /* renamed from: v, reason: from getter */
        public T getAdsColorDisabled() {
            return this.adsColorDisabled;
        }

        @Override // Ji.z
        /* renamed from: w, reason: from getter */
        public T getAdsColorHover02() {
            return this.adsColorHover02;
        }

        @Override // Ji.z
        /* renamed from: x, reason: from getter */
        public T getAdsColorSupportInformational() {
            return this.adsColorSupportInformational;
        }

        @Override // Ji.z
        /* renamed from: y, reason: from getter */
        public T getAdsColorSavings() {
            return this.adsColorSavings;
        }

        @Override // Ji.z
        /* renamed from: z, reason: from getter */
        public T getAdsColorHover01() {
            return this.adsColorHover01;
        }

        a(T.b.a0 a0Var) {
            this.adsColorBrandPrimary = new T.b.C3878h(a0Var);
            this.adsColorBrandSecondary = new T.b.C3879i(a0Var);
            this.adsColorText01 = new T.b.L(a0Var);
            this.adsColorText02 = new T.b.M(a0Var);
            this.adsColorText03 = new T.b.N(a0Var);
            this.adsColorPlaceholder = new T.b.B(a0Var);
            this.adsColorInteractive04Active = new T.b.C3893x(a0Var);
            this.adsColorDisabled = new T.b.C3881k(a0Var);
            this.adsColorsDisabled = new T.b.X(a0Var);
            this.adsColorSavings = new T.b.C(a0Var);
            this.adsColorLink = new T.b.A(a0Var);
            this.adsColorIcon01 = new T.b.t(a0Var);
            this.adsColorIcon02 = new T.b.C3890u(a0Var);
            this.adsColorIcon03 = new T.b.C3891v(a0Var);
            this.adsColorIconSubtle = new T.b.C3892w(a0Var);
            this.adsColorEnabled01 = new T.b.C3882l(a0Var);
            this.adsColorEnabled02 = new T.b.C3883m(a0Var);
            this.adsColorsEnabled02 = new T.b.Y(a0Var);
            this.adsColorTransparent = new T.b.P(a0Var);
            this.adsColorDanger = new T.b.C3880j(a0Var);
            this.adsColorSupportError = new T.b.D(a0Var);
            this.adsColorSupportSuccess = new T.b.H(a0Var);
            this.adsColorSupportWarning = new T.b.J(a0Var);
            this.adsColorTextHighlight = new T.b.O(a0Var);
            this.adsColorSupportInformational = new T.b.F(a0Var);
            this.adsColorSupportErrorBg = new T.b.E(a0Var);
            this.adsColorSupportSuccessBg = new T.b.I(a0Var);
            this.adsColorSupportWarningBg = new T.b.K(a0Var);
            this.adsColorSupportInformationalBg = new T.b.G(a0Var);
            this.adsColorInverse = new T.b.C3895z(a0Var);
            this.adsColorInteractiveEnabled04 = new T.b.C3894y(a0Var);
            this.adsColorUIBackground01 = new T.b.Q(a0Var);
            this.adsColorUIBackground02 = new T.b.R(a0Var);
            this.adsColorUIBorder01 = new T.b.S(a0Var);
            this.adsColorUIBorder02 = new T.b.C0271T(a0Var);
            this.adsColorUIDivider = new T.b.U(a0Var);
            this.adsColorUIOverlay = new T.b.V(a0Var);
            this.adsColorFocus = new T.b.C3884n(a0Var);
            this.adsColorHover01 = new T.b.C3885o(a0Var);
            this.adsColorHover02 = new T.b.C3886p(a0Var);
            this.adsColorHoverTransparent = new T.b.C3889s(a0Var);
            this.adsColorHoverDanger = new T.b.C3887q(a0Var);
            this.adsColorHoverInverse = new T.b.C3888r(a0Var);
            this.adsColorActive01 = new T.b.C3873c(a0Var);
            this.adsInteractiveSelected = new T.b.Z(a0Var);
            this.adsColorActive02 = new T.b.C3874d(a0Var);
            this.adsColorsActive02 = new T.b.W(a0Var);
            this.adsColorActiveTransparent = new T.b.C3877g(a0Var);
            this.adsColorActiveDanger = new T.b.C3875e(a0Var);
            this.adsColorActiveInverse = new T.b.C3876f(a0Var);
            this.acresGradientBlueStart = new T.b.C0273b(a0Var);
            this.acresGradientBlueEnd = new T.b.C3872a(a0Var);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u0013"}, d2 = {"Ji/K$b", "LJi/A;", "LJi/S;", "a", "LJi/S;", "f", "()LJi/S;", "radius01", "b", "e", "radius02", "c", "g", "radius03", "d", "radius04", "radius05", "radius06", "radius07", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements A {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final S radius01 = S.a.c.f15793b;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final S radius02 = S.a.g.f15797b;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final S radius03 = S.a.f.f15796b;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final S radius04 = S.a.b.f15792b;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final S radius05 = S.a.C0268a.f15791b;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final S radius06 = S.a.e.f15795b;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final S radius07 = S.a.d.f15794b;

        @Override // Ji.A
        /* renamed from: a, reason: from getter */
        public S getRadius06() {
            return this.radius06;
        }

        @Override // Ji.A
        /* renamed from: b, reason: from getter */
        public S getRadius07() {
            return this.radius07;
        }

        @Override // Ji.A
        /* renamed from: c, reason: from getter */
        public S getRadius04() {
            return this.radius04;
        }

        @Override // Ji.A
        /* renamed from: d, reason: from getter */
        public S getRadius05() {
            return this.radius05;
        }

        @Override // Ji.A
        /* renamed from: e, reason: from getter */
        public S getRadius02() {
            return this.radius02;
        }

        @Override // Ji.A
        /* renamed from: f, reason: from getter */
        public S getRadius01() {
            return this.radius01;
        }

        @Override // Ji.A
        /* renamed from: g, reason: from getter */
        public S getRadius03() {
            return this.radius03;
        }

        b() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends FunctionReferenceImpl implements Function1<H1.h, Gi.i> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<H1.h> f15748b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC5730l0<H1.h> interfaceC5730l0) {
            super(1, Intrinsics.Kotlin.class, "createToast", "AdsTheme$createToast(Landroidx/compose/runtime/MutableState;F)Lcom/meijer/mobile/android_acres_library/composables/state/ToastHostState;", 0);
            this.f15748b = interfaceC5730l0;
        }

        public final Gi.i a(float f10) {
            return K.c(this.f15748b, f10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Gi.i invoke(H1.h hVar) {
            return a(hVar.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R\u001a\u0010\u0014\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u001a\u0010\u0018\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006R\u001a\u0010\u0019\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u001a\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001a\u0010\u001c\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u001a\u0010\u001d\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u001a\u0010\u001e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u001f"}, d2 = {"Ji/K$d", "LJi/E;", "LJi/V;", "a", "LJi/V;", "b", "()LJi/V;", "one", "j", "two", "c", "g", "three", "d", "m", "four", "e", "f", "five", "i", "six", "h", "seven", "l", "eight", "nine", "ten", "k", "eleven", "twelve", "thirteen", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements E {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final V one = V.a.f.f15892c;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final V two = V.a.m.f15899c;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final V three = V.a.k.f15897c;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final V four = V.a.d.f15890c;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final V five = V.a.c.f15889c;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final V six = V.a.h.f15894c;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final V seven = V.a.g.f15893c;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final V eight = V.a.C0274a.f15887c;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final V nine = V.a.e.f15891c;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final V ten = V.a.i.f15895c;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final V eleven = V.a.b.f15888c;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final V twelve = V.a.l.f15898c;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final V thirteen = V.a.j.f15896c;

        @Override // Ji.E
        /* renamed from: a, reason: from getter */
        public V getTen() {
            return this.ten;
        }

        @Override // Ji.E
        /* renamed from: b, reason: from getter */
        public V getOne() {
            return this.one;
        }

        @Override // Ji.E
        /* renamed from: c, reason: from getter */
        public V getNine() {
            return this.nine;
        }

        @Override // Ji.E
        /* renamed from: d, reason: from getter */
        public V getTwelve() {
            return this.twelve;
        }

        @Override // Ji.E
        /* renamed from: e, reason: from getter */
        public V getThirteen() {
            return this.thirteen;
        }

        @Override // Ji.E
        /* renamed from: f, reason: from getter */
        public V getFive() {
            return this.five;
        }

        @Override // Ji.E
        /* renamed from: g, reason: from getter */
        public V getThree() {
            return this.three;
        }

        @Override // Ji.E
        /* renamed from: h, reason: from getter */
        public V getSeven() {
            return this.seven;
        }

        @Override // Ji.E
        /* renamed from: i, reason: from getter */
        public V getSix() {
            return this.six;
        }

        @Override // Ji.E
        /* renamed from: j, reason: from getter */
        public V getTwo() {
            return this.two;
        }

        @Override // Ji.E
        /* renamed from: k, reason: from getter */
        public V getEleven() {
            return this.eleven;
        }

        @Override // Ji.E
        /* renamed from: l, reason: from getter */
        public V getEight() {
            return this.eight;
        }

        @Override // Ji.E
        /* renamed from: m, reason: from getter */
        public V getFour() {
            return this.four;
        }

        d() {
        }
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0003\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001e\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u0013\u0010\u001dR\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u001a\u0010%\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u000e\u0010$¨\u0006&"}, d2 = {"Ji/K$e", "LJi/L;", "LJi/r;", "a", "LJi/r;", "b", "()LJi/r;", "headings", "LJi/s;", "LJi/s;", "getPrices", "()LJi/s;", "prices", "LJi/y;", "c", "LJi/y;", "()LJi/y;", "values", "LJi/c;", "d", "LJi/c;", "f", "()LJi/c;", "body", "e", "getBodyLong", "bodyLong", "LJi/f;", "LJi/f;", "()LJi/f;", "bodyCompact", "g", "bodyShort", "LJi/h;", "h", "LJi/h;", "()LJi/h;", "detail", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements L {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Headings headings;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Prices prices;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Values values;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Body body;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final Body bodyLong;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final BodyCompact bodyCompact;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final BodyCompact bodyShort;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final Detail detail;

        /* JADX WARN: Multi-variable type inference failed */
        e(W.a aVar) {
            this.headings = new Headings(aVar, null, null, null, null, null, null, null, null, null, 1022, null);
            int i10 = 62;
            DefaultConstructorMarker defaultConstructorMarker = null;
            I i11 = null;
            I i12 = null;
            I i13 = null;
            I i14 = null;
            this.prices = new Prices(aVar, i11, i12, i13, null, i14, i10, defaultConstructorMarker);
            this.values = new Values(aVar, i11, i12, i13, 0 == true ? 1 : 0, i14, i10, defaultConstructorMarker);
            int i15 = 6;
            this.body = new Body(aVar, i11, i12, i15, 0 == true ? 1 : 0);
            this.bodyLong = new Body(aVar, i11, i12, i15, 0 == true ? 1 : 0);
            this.bodyCompact = new BodyCompact(aVar, i11, i12, i15, 0 == true ? 1 : 0);
            this.bodyShort = new BodyCompact(aVar, i11, i12, i15, 0 == true ? 1 : 0);
            this.detail = new Detail(aVar, null, 2, 0 == true ? 1 : 0);
        }

        @Override // Ji.L
        /* renamed from: a, reason: from getter */
        public Values getValues() {
            return this.values;
        }

        @Override // Ji.L
        /* renamed from: b, reason: from getter */
        public Headings getHeadings() {
            return this.headings;
        }

        @Override // Ji.L
        /* renamed from: c, reason: from getter */
        public Detail getDetail() {
            return this.detail;
        }

        @Override // Ji.L
        /* renamed from: d, reason: from getter */
        public BodyCompact getBodyCompact() {
            return this.bodyCompact;
        }

        @Override // Ji.L
        /* renamed from: e, reason: from getter */
        public BodyCompact getBodyShort() {
            return this.bodyShort;
        }

        @Override // Ji.L
        /* renamed from: f, reason: from getter */
        public Body getBody() {
            return this.body;
        }
    }

    @SuppressLint({"AlwaysProvideAModifier"})
    public static final void b(N1 n12, final Function3<? super LocalThemeScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i10, final int i11) {
        int i12;
        final N1 n13;
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(813740242);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.d(n12 == null ? -1 : n12.ordinal()) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(content) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            n13 = n12;
        } else {
            n13 = i13 != 0 ? N1.f151542a : n12;
            if (ComposerKt.M()) {
                ComposerKt.U(813740242, i12, -1, "com.meijer.mobile.android_acres_library.foundations.v2.AdsTheme (AdsTheme.kt:41)");
            }
            a aVar = new a(C13448o.a(composerStartRestartGroup, 0) ? T.b.a0.f15877b : T.b.a0.f15876a);
            e eVar = new e(new W.a(aVar.getAdsColorText01().getColor(), aVar.getAdsColorText02().getColor(), aVar.getAdsColorText03().getColor(), aVar.getAdsColorPlaceholder().getColor(), aVar.getAdsColorSavings().getColor(), aVar.getAdsColorLink().getColor(), aVar.getAdsColorInverse().getColor(), null));
            d dVar = new d();
            b bVar = new b();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(H1.h.l(H1.h.p(0)), null, 2, null);
                composerStartRestartGroup.t(objB);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new c(interfaceC5730l0);
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            LocalThemeScope localThemeScope = new LocalThemeScope(aVar, eVar, dVar, bVar, n13, (Function1) ((KFunction) objB2));
            Modifier.Companion companion2 = Modifier.INSTANCE;
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5662h.g(companion3.o(), false);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion2);
            InterfaceC5811g.Companion aVar2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = aVar2.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyG, aVar2.e());
            D1.c(composerA, interfaceC5742sR, aVar2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = aVar2.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, aVar2.f());
            C5664j c5664j = C5664j.f48612a;
            content.invoke(localThemeScope, composerStartRestartGroup, Integer.valueOf(i12 & 112));
            Modifier modifierG = c5664j.g(companion2, companion3.b());
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), companion3.k(), composerStartRestartGroup, 0);
            int iA2 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierG);
            Function0<InterfaceC5811g> function0A2 = aVar2.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = D1.a(composerStartRestartGroup);
            D1.c(composerA2, measurePolicyA, aVar2.e());
            D1.c(composerA2, interfaceC5742sR2, aVar2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = aVar2.b();
            if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, aVar2.f());
            C14815g c14815g = C14815g.f139108a;
            composerStartRestartGroup.startReplaceGroup(-1586839010);
            Iterator<Gi.i> it = Gi.i.INSTANCE.c().iterator();
            while (it.hasNext()) {
                Ci.j.o(it.next(), null, localThemeScope, composerStartRestartGroup, 0, 2);
            }
            composerStartRestartGroup.P();
            C14802K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, d(interfaceC5730l0)), composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ji.J
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return K.f(n13, content, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gi.i c(InterfaceC5730l0<H1.h> interfaceC5730l0, float f10) {
        Gi.i iVar = new Gi.i();
        e(interfaceC5730l0, f10);
        Gi.i.INSTANCE.a(iVar);
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(N1 n12, Function3 function3, int i10, int i11, Composer composer, int i12) {
        b(n12, function3, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    private static final float d(InterfaceC5730l0<H1.h> interfaceC5730l0) {
        return interfaceC5730l0.getValue().getValue();
    }

    private static final void e(InterfaceC5730l0<H1.h> interfaceC5730l0, float f10) {
        interfaceC5730l0.setValue(H1.h.l(f10));
    }
}
