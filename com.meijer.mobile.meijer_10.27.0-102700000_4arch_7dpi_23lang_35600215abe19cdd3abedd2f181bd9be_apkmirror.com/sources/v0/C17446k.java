package v0;

import F1.l;
import F1.t;
import H1.v;
import V0.AbstractC5324i0;
import V0.C5346q0;
import V0.InterfaceC5359x0;
import V0.Shadow;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.layout.AbstractC5774a;
import androidx.compose.ui.layout.C5775b;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.InterfaceC5791s;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.layout.r;
import androidx.compose.ui.node.C5824u;
import androidx.compose.ui.node.D;
import androidx.compose.ui.node.G;
import androidx.compose.ui.node.InterfaceC5823t;
import androidx.compose.ui.node.u0;
import androidx.compose.ui.node.v0;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import i0.C14589e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC18142l;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.s;
import r1.u;
import u1.InterfaceC17214f;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00017BS\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010!J\u001f\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b&\u0010\u001eJ@\u0010'\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b'\u0010(J%\u0010,\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r¢\u0006\u0004\b,\u0010-J\u0013\u0010/\u001a\u00020\u001f*\u00020.H\u0016¢\u0006\u0004\b/\u00100J&\u00107\u001a\u000206*\u0002012\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0016ø\u0001\u0000¢\u0006\u0004\b7\u00108J#\u0010;\u001a\u00020\u000f*\u00020\u00162\u0006\u00103\u001a\u0002092\u0006\u0010:\u001a\u00020\u000fH\u0016¢\u0006\u0004\b;\u0010<J#\u0010>\u001a\u00020\u000f*\u00020\u00162\u0006\u00103\u001a\u0002092\u0006\u0010=\u001a\u00020\u000fH\u0016¢\u0006\u0004\b>\u0010<J#\u0010?\u001a\u00020\u000f*\u00020\u00162\u0006\u00103\u001a\u0002092\u0006\u0010:\u001a\u00020\u000fH\u0016¢\u0006\u0004\b?\u0010<J#\u0010@\u001a\u00020\u000f*\u00020\u00162\u0006\u00103\u001a\u0002092\u0006\u0010=\u001a\u00020\u000fH\u0016¢\u0006\u0004\b@\u0010<J\u0013\u0010B\u001a\u00020\u001f*\u00020AH\u0016¢\u0006\u0004\bB\u0010CR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b@\u0010BR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010BR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010BR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR*\u0010U\u001a\u0010\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\u000f\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bR\u0010S\u0012\u0004\bT\u0010!R\u0018\u0010X\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR*\u0010^\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0Z\u0012\u0004\u0012\u00020\r\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010d\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010\u001bR\u0014\u0010g\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006h"}, d2 = {"Lv0/k;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/D;", "Landroidx/compose/ui/node/t;", "Landroidx/compose/ui/node/u0;", "", "text", "Landroidx/compose/ui/text/z;", "style", "Ly1/l$b;", "fontFamilyResolver", "LF1/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "LV0/x0;", "overrideColor", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/z;Ly1/l$b;IZIILV0/x0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/s;", "Lv0/f;", "U2", "(Landroidx/compose/ui/layout/s;)Lv0/f;", "V2", "()Lv0/f;", "updatedText", "X2", "(Ljava/lang/String;)Z", "", "R2", "()V", "W2", "color", "Y2", "(LV0/x0;Landroidx/compose/ui/text/z;)Z", "a3", "Z2", "(Landroidx/compose/ui/text/z;IIZLy1/l$b;I)Z", "drawChanged", "textChanged", "layoutChanged", "S2", "(ZZZ)V", "Lr1/u;", "T1", "(Lr1/u;)V", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "Landroidx/compose/ui/layout/r;", "height", "J", "(Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/r;I)I", "width", "F", "N", "r", "LX0/c;", "I", "(LX0/c;)V", "o", "Ljava/lang/String;", "p", "Landroidx/compose/ui/text/z;", "q", "Ly1/l$b;", "s", "Z", "t", "u", "v", "LV0/x0;", "", "Landroidx/compose/ui/layout/a;", "w", "Ljava/util/Map;", "getBaselineCache$annotations", "baselineCache", "x", "Lv0/f;", "_layoutCache", "Lkotlin/Function1;", "", "Lu1/v;", "y", "Lkotlin/jvm/functions/Function1;", "semanticsTextLayoutResult", "Lv0/k$a;", "z", "Lv0/k$a;", "textSubstitution", "T2", "layoutCache", "o2", "()Z", "shouldAutoInvalidate", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: v0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17446k extends Modifier.c implements D, InterfaceC5823t, u0 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private String text;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private TextStyle style;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private AbstractC18142l.b fontFamilyResolver;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int overflow;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean softWrap;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int maxLines;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private int minLines;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5359x0 overrideColor;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private Map<AbstractC5774a, Integer> baselineCache;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private C17441f _layoutCache;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private Function1<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private TextSubstitution textSubstitution;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0013\u0010 \"\u0004\b\u001e\u0010!¨\u0006\""}, d2 = {"Lv0/k$a;", "", "", "original", "substitution", "", "isShowingSubstitution", "Lv0/f;", "layoutCache", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLv0/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getOriginal", "b", "f", "(Ljava/lang/String;)V", "c", "Z", "()Z", "e", "(Z)V", "d", "Lv0/f;", "()Lv0/f;", "(Lv0/f;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: v0.k$a, reason: from toString */
    public static final /* data */ class TextSubstitution {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String original;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String substitution;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private boolean isShowingSubstitution;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private C17441f layoutCache;

        public TextSubstitution(String str, String str2, boolean z10, C17441f c17441f) {
            this.original = str;
            this.substitution = str2;
            this.isShowingSubstitution = z10;
            this.layoutCache = c17441f;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextSubstitution)) {
                return false;
            }
            TextSubstitution textSubstitution = (TextSubstitution) other;
            return Intrinsics.e(this.original, textSubstitution.original) && Intrinsics.e(this.substitution, textSubstitution.substitution) && this.isShowingSubstitution == textSubstitution.isShowingSubstitution && Intrinsics.e(this.layoutCache, textSubstitution.layoutCache);
        }

        /* renamed from: a, reason: from getter */
        public final C17441f getLayoutCache() {
            return this.layoutCache;
        }

        /* renamed from: b, reason: from getter */
        public final String getSubstitution() {
            return this.substitution;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void d(C17441f c17441f) {
            this.layoutCache = c17441f;
        }

        public final void e(boolean z10) {
            this.isShowingSubstitution = z10;
        }

        public final void f(String str) {
            this.substitution = str;
        }

        public int hashCode() {
            int iHashCode = ((((this.original.hashCode() * 31) + this.substitution.hashCode()) * 31) + Boolean.hashCode(this.isShowingSubstitution)) * 31;
            C17441f c17441f = this.layoutCache;
            return iHashCode + (c17441f == null ? 0 : c17441f.hashCode());
        }

        public String toString() {
            return "TextSubstitution(layoutCache=" + this.layoutCache + ", isShowingSubstitution=" + this.isShowingSubstitution + ')';
        }

        public /* synthetic */ TextSubstitution(String str, String str2, boolean z10, C17441f c17441f, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : c17441f);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lu1/v;", "textLayoutResult", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: v0.k$b */
    static final class b extends Lambda implements Function1<List<TextLayoutResult>, Boolean> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<TextLayoutResult> list) {
            C17441f c17441fT2 = C17446k.this.T2();
            TextStyle textStyle = C17446k.this.style;
            InterfaceC5359x0 interfaceC5359x0 = C17446k.this.overrideColor;
            TextLayoutResult textLayoutResultO = c17441fT2.o(textStyle.K((16609105 & 1) != 0 ? C5346q0.INSTANCE.j() : interfaceC5359x0 != null ? interfaceC5359x0.a() : C5346q0.INSTANCE.j(), (16609105 & 2) != 0 ? v.INSTANCE.a() : 0L, (16609105 & 4) != 0 ? null : null, (16609105 & 8) != 0 ? null : null, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : null, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? v.INSTANCE.a() : 0L, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & RecyclerView.m.FLAG_MOVED) != 0 ? C5346q0.INSTANCE.j() : 0L, (16609105 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : null, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? F1.j.INSTANCE.g() : 0, (16609105 & 65536) != 0 ? l.INSTANCE.f() : 0, (16609105 & 131072) != 0 ? v.INSTANCE.a() : 0L, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? F1.f.INSTANCE.b() : 0, (16609105 & 2097152) != 0 ? F1.e.INSTANCE.c() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null));
            if (textLayoutResultO != null) {
                list.add(textLayoutResultO);
            } else {
                textLayoutResultO = null;
            }
            return Boolean.valueOf(textLayoutResultO != null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "updatedText", "", "a", "(Landroidx/compose/ui/text/AnnotatedString;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: v0.k$c */
    static final class c extends Lambda implements Function1<AnnotatedString, Boolean> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AnnotatedString annotatedString) {
            C17446k.this.X2(annotatedString.getText());
            C17446k.this.W2();
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: v0.k$d */
    static final class d extends Lambda implements Function1<Boolean, Boolean> {
        d() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            if (C17446k.this.textSubstitution == null) {
                return Boolean.FALSE;
            }
            TextSubstitution textSubstitution = C17446k.this.textSubstitution;
            if (textSubstitution != null) {
                textSubstitution.e(z10);
            }
            C17446k.this.W2();
            return Boolean.TRUE;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: v0.k$e */
    static final class e extends Lambda implements Function0<Boolean> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            C17446k.this.R2();
            C17446k.this.W2();
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: v0.k$f */
    static final class f extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f164322f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(f0 f0Var) {
            super(1);
            this.f164322f = f0Var;
        }

        public final void a(f0.a aVar) {
            f0.a.h(aVar, this.f164322f, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    public /* synthetic */ C17446k(String str, TextStyle textStyle, AbstractC18142l.b bVar, int i10, boolean z10, int i11, int i12, InterfaceC5359x0 interfaceC5359x0, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, bVar, i10, z10, i11, i12, interfaceC5359x0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R2() {
        this.textSubstitution = null;
    }

    @Override // androidx.compose.ui.Modifier.c
    /* renamed from: o2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    private C17446k(String str, TextStyle textStyle, AbstractC18142l.b bVar, int i10, boolean z10, int i11, int i12, InterfaceC5359x0 interfaceC5359x0) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = bVar;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        this.overrideColor = interfaceC5359x0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C17441f T2() {
        if (this._layoutCache == null) {
            this._layoutCache = new C17441f(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
        }
        C17441f c17441f = this._layoutCache;
        Intrinsics.g(c17441f);
        return c17441f;
    }

    @JvmName
    private final C17441f V2() {
        C17441f layoutCache;
        TextSubstitution textSubstitution = this.textSubstitution;
        if (textSubstitution != null) {
            if (!textSubstitution.getIsShowingSubstitution()) {
                textSubstitution = null;
            }
            if (textSubstitution != null && (layoutCache = textSubstitution.getLayoutCache()) != null) {
                return layoutCache;
            }
        }
        return T2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean X2(String updatedText) {
        Unit unit;
        TextSubstitution textSubstitution = this.textSubstitution;
        if (textSubstitution == null) {
            TextSubstitution textSubstitution2 = new TextSubstitution(this.text, updatedText, false, null, 12, null);
            C17441f c17441f = new C17441f(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
            c17441f.m(T2().getDensity());
            textSubstitution2.d(c17441f);
            this.textSubstitution = textSubstitution2;
            return true;
        }
        if (Intrinsics.e(updatedText, textSubstitution.getSubstitution())) {
            return false;
        }
        textSubstitution.f(updatedText);
        C17441f layoutCache = textSubstitution.getLayoutCache();
        if (layoutCache != null) {
            layoutCache.p(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
            unit = Unit.f142422a;
        } else {
            unit = null;
        }
        return unit != null;
    }

    public final void S2(boolean drawChanged, boolean textChanged, boolean layoutChanged) {
        if (textChanged || layoutChanged) {
            T2().p(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
        }
        if (getIsAttached()) {
            if (textChanged || (drawChanged && this.semanticsTextLayoutResult != null)) {
                v0.b(this);
            }
            if (textChanged || layoutChanged) {
                G.b(this);
                C5824u.a(this);
            }
            if (drawChanged) {
                C5824u.a(this);
            }
        }
    }

    @Override // androidx.compose.ui.node.u0
    public void T1(u uVar) {
        Function1 bVar = this.semanticsTextLayoutResult;
        if (bVar == null) {
            bVar = new b();
            this.semanticsTextLayoutResult = bVar;
        }
        s.z0(uVar, new AnnotatedString(this.text, null, 2, null));
        TextSubstitution textSubstitution = this.textSubstitution;
        if (textSubstitution != null) {
            s.w0(uVar, textSubstitution.getIsShowingSubstitution());
            s.D0(uVar, new AnnotatedString(textSubstitution.getSubstitution(), null, 2, null));
        }
        s.F0(uVar, null, new c(), 1, null);
        s.K0(uVar, null, new d(), 1, null);
        s.d(uVar, null, new e(), 1, null);
        s.u(uVar, null, bVar, 1, null);
    }

    public final boolean Y2(InterfaceC5359x0 color, TextStyle style) {
        boolean zE = Intrinsics.e(color, this.overrideColor);
        this.overrideColor = color;
        return (zE && style.F(this.style)) ? false : true;
    }

    public final boolean Z2(TextStyle style, int minLines, int maxLines, boolean softWrap, AbstractC18142l.b fontFamilyResolver, int overflow) {
        boolean z10 = !this.style.G(style);
        this.style = style;
        if (this.minLines != minLines) {
            this.minLines = minLines;
            z10 = true;
        }
        if (this.maxLines != maxLines) {
            this.maxLines = maxLines;
            z10 = true;
        }
        if (this.softWrap != softWrap) {
            this.softWrap = softWrap;
            z10 = true;
        }
        if (!Intrinsics.e(this.fontFamilyResolver, fontFamilyResolver)) {
            this.fontFamilyResolver = fontFamilyResolver;
            z10 = true;
        }
        if (t.g(this.overflow, overflow)) {
            return z10;
        }
        this.overflow = overflow;
        return true;
    }

    public final boolean a3(String text) {
        if (Intrinsics.e(this.text, text)) {
            return false;
        }
        this.text = text;
        R2();
        return true;
    }

    private final C17441f U2(InterfaceC5791s interfaceC5791s) {
        C17441f c17441fV2 = V2();
        c17441fV2.m(interfaceC5791s);
        return c17441fV2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W2() {
        v0.b(this);
        G.b(this);
        C5824u.a(this);
    }

    @Override // androidx.compose.ui.node.D
    public int F(InterfaceC5791s interfaceC5791s, r rVar, int i10) {
        return U2(interfaceC5791s).f(i10, interfaceC5791s.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.InterfaceC5823t
    public void I(X0.c cVar) {
        long j10;
        if (getIsAttached()) {
            C17441f c17441fV2 = V2();
            InterfaceC17214f paragraph = c17441fV2.getParagraph();
            if (paragraph != null) {
                Canvas canvasG = cVar.getDrawContext().g();
                boolean didOverflow = c17441fV2.getDidOverflow();
                if (didOverflow) {
                    float layoutSize = (int) (c17441fV2.getLayoutSize() >> 32);
                    float layoutSize2 = (int) (c17441fV2.getLayoutSize() & 4294967295L);
                    canvasG.save();
                    Canvas.m(canvasG, 0.0f, 0.0f, layoutSize, layoutSize2, 0, 16, null);
                }
                try {
                    F1.k kVarA = this.style.A();
                    if (kVarA == null) {
                        kVarA = F1.k.INSTANCE.c();
                    }
                    F1.k kVar = kVarA;
                    Shadow shadowX = this.style.x();
                    if (shadowX == null) {
                        shadowX = Shadow.INSTANCE.a();
                    }
                    Shadow shadow = shadowX;
                    X0.g gVarI = this.style.i();
                    if (gVarI == null) {
                        gVarI = X0.j.f39072a;
                    }
                    X0.g gVar = gVarI;
                    AbstractC5324i0 abstractC5324i0G = this.style.g();
                    if (abstractC5324i0G != null) {
                        InterfaceC17214f.C(paragraph, canvasG, abstractC5324i0G, this.style.d(), shadow, kVar, gVar, 0, 64, null);
                    } else {
                        InterfaceC5359x0 interfaceC5359x0 = this.overrideColor;
                        if (interfaceC5359x0 != null) {
                            j10 = interfaceC5359x0.a();
                        } else {
                            j10 = C5346q0.INSTANCE.j();
                        }
                        if (j10 == 16) {
                            if (this.style.h() != 16) {
                                j10 = this.style.h();
                            } else {
                                j10 = C5346q0.INSTANCE.a();
                            }
                        }
                        InterfaceC17214f.q(paragraph, canvasG, j10, shadow, kVar, gVar, 0, 32, null);
                    }
                    if (didOverflow) {
                        canvasG.i();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (didOverflow) {
                        canvasG.i();
                    }
                    throw th2;
                }
            }
            C14589e.b("no paragraph (layoutCache=" + this._layoutCache + ", textSubstitution=" + this.textSubstitution + ')');
            throw new KotlinNothingValueException();
        }
    }

    @Override // androidx.compose.ui.node.D
    public int J(InterfaceC5791s interfaceC5791s, r rVar, int i10) {
        return U2(interfaceC5791s).k(interfaceC5791s.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.D
    public int N(InterfaceC5791s interfaceC5791s, r rVar, int i10) {
        return U2(interfaceC5791s).j(interfaceC5791s.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.D
    public J a(K k10, I i10, long j10) {
        C17441f c17441fU2 = U2(k10);
        boolean zH = c17441fU2.h(j10, k10.getLayoutDirection());
        c17441fU2.d();
        InterfaceC17214f paragraph = c17441fU2.getParagraph();
        Intrinsics.g(paragraph);
        long layoutSize = c17441fU2.getLayoutSize();
        if (zH) {
            G.a(this);
            Map map = this.baselineCache;
            if (map == null) {
                map = new HashMap(2);
                this.baselineCache = map;
            }
            map.put(C5775b.a(), Integer.valueOf(Math.round(paragraph.l())));
            map.put(C5775b.b(), Integer.valueOf(Math.round(paragraph.w())));
        }
        int i11 = (int) (layoutSize >> 32);
        int i12 = (int) (layoutSize & 4294967295L);
        f0 f0VarK0 = i10.k0(H1.b.INSTANCE.b(i11, i11, i12, i12));
        Map<AbstractC5774a, Integer> map2 = this.baselineCache;
        Intrinsics.g(map2);
        return k10.g1(i11, i12, map2, new f(f0VarK0));
    }

    @Override // androidx.compose.ui.node.D
    public int r(InterfaceC5791s interfaceC5791s, r rVar, int i10) {
        return U2(interfaceC5791s).f(i10, interfaceC5791s.getLayoutDirection());
    }
}
