package androidx.compose.foundation.layout;

import P0.e;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.L0;
import androidx.compose.ui.platform.N0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u001e\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001e\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u001e\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0004\u001a&\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\r\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\n\u001a*\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\n\u001a>\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001e\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0004\u001a\u001e\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0004\u001a\u001e\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0004\u001a&\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\n\u001a*\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\n\u001a*\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\n\u001a>\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0014\u001a\u001d\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u0004\u001a\u001d\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001f\u0010\u0004\u001a\u001d\u0010 \u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b \u0010\u0004\u001a'\u0010%\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&\u001a'\u0010(\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020'2\b\b\u0002\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b(\u0010)\u001a'\u0010+\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020*2\b\b\u0002\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b+\u0010,\u001a*\u0010-\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010\n\"\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010/\"\u0014\u00102\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/\"\u0014\u00103\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010/\"\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106\"\u0014\u00108\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00106\"\u0014\u0010:\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00106\"\u0014\u0010;\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00106\"\u0014\u0010=\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00106\"\u0014\u0010>\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00106\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?"}, d2 = {"Landroidx/compose/ui/Modifier;", "LH1/h;", "width", "z", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "height", "i", "size", "v", "w", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "min", "max", "A", "j", "minWidth", "minHeight", "maxWidth", "maxHeight", "x", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "s", "l", "o", "p", "t", "m", "q", "", "fraction", "g", "c", "e", "LP0/e$b;", "align", "", "unbounded", "G", "(Landroidx/compose/ui/Modifier;LP0/e$b;Z)Landroidx/compose/ui/Modifier;", "LP0/e$c;", "C", "(Landroidx/compose/ui/Modifier;LP0/e$c;Z)Landroidx/compose/ui/Modifier;", "LP0/e;", "E", "(Landroidx/compose/ui/Modifier;LP0/e;Z)Landroidx/compose/ui/Modifier;", "a", "Landroidx/compose/foundation/layout/FillElement;", "Landroidx/compose/foundation/layout/FillElement;", "FillWholeMaxWidth", "b", "FillWholeMaxHeight", "FillWholeMaxSize", "Landroidx/compose/foundation/layout/WrapContentElement;", "d", "Landroidx/compose/foundation/layout/WrapContentElement;", "WrapContentWidthCenter", "WrapContentWidthStart", "f", "WrapContentHeightCenter", "WrapContentHeightTop", "h", "WrapContentSizeCenter", "WrapContentSizeTopStart", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private static final FillElement f48676a;

    /* renamed from: b, reason: collision with root package name */
    private static final FillElement f48677b;

    /* renamed from: c, reason: collision with root package name */
    private static final FillElement f48678c;

    /* renamed from: d, reason: collision with root package name */
    private static final WrapContentElement f48679d;

    /* renamed from: e, reason: collision with root package name */
    private static final WrapContentElement f48680e;

    /* renamed from: f, reason: collision with root package name */
    private static final WrapContentElement f48681f;

    /* renamed from: g, reason: collision with root package name */
    private static final WrapContentElement f48682g;

    /* renamed from: h, reason: collision with root package name */
    private static final WrapContentElement f48683h;

    /* renamed from: i, reason: collision with root package name */
    private static final WrapContentElement f48684i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class a extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f48685f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10) {
            super(1);
            this.f48685f = f10;
        }

        public final void a(N0 n02) {
            n02.b("height");
            n02.c(H1.h.l(this.f48685f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class b extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f48686f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f48687g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10, float f11) {
            super(1);
            this.f48686f = f10;
            this.f48687g = f11;
        }

        public final void a(N0 n02) {
            n02.b("heightIn");
            n02.getProperties().c("min", H1.h.l(this.f48686f));
            n02.getProperties().c("max", H1.h.l(this.f48687g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class c extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f48688f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f10) {
            super(1);
            this.f48688f = f10;
        }

        public final void a(N0 n02) {
            n02.b("requiredHeight");
            n02.c(H1.h.l(this.f48688f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class d extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f48689f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f48690g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f10, float f11) {
            super(1);
            this.f48689f = f10;
            this.f48690g = f11;
        }

        public final void a(N0 n02) {
            n02.b("requiredHeightIn");
            n02.getProperties().c("min", H1.h.l(this.f48689f));
            n02.getProperties().c("max", H1.h.l(this.f48690g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class e extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f48691f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(float f10) {
            super(1);
            this.f48691f = f10;
        }

        public final void a(N0 n02) {
            n02.b("requiredSize");
            n02.c(H1.h.l(this.f48691f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class f extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f48692f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f48693g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(float f10, float f11) {
            super(1);
            this.f48692f = f10;
            this.f48693g = f11;
        }

        public final void a(N0 n02) {
            n02.b("requiredSize");
            n02.getProperties().c("width", H1.h.l(this.f48692f));
            n02.getProperties().c("height", H1.h.l(this.f48693g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class g extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f48694f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f48695g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f48696h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f48697i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(float f10, float f11, float f12, float f13) {
            super(1);
            this.f48694f = f10;
            this.f48695g = f11;
            this.f48696h = f12;
            this.f48697i = f13;
        }

        public final void a(N0 n02) {
            n02.b("requiredSizeIn");
            n02.getProperties().c("minWidth", H1.h.l(this.f48694f));
            n02.getProperties().c("minHeight", H1.h.l(this.f48695g));
            n02.getProperties().c("maxWidth", H1.h.l(this.f48696h));
            n02.getProperties().c("maxHeight", H1.h.l(this.f48697i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class h extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f48698f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(float f10) {
            super(1);
            this.f48698f = f10;
        }

        public final void a(N0 n02) {
            n02.b("requiredWidth");
            n02.c(H1.h.l(this.f48698f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class i extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f48699f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f48700g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(float f10, float f11) {
            super(1);
            this.f48699f = f10;
            this.f48700g = f11;
        }

        public final void a(N0 n02) {
            n02.b("requiredWidthIn");
            n02.getProperties().c("min", H1.h.l(this.f48699f));
            n02.getProperties().c("max", H1.h.l(this.f48700g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class j extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f48701f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(float f10) {
            super(1);
            this.f48701f = f10;
        }

        public final void a(N0 n02) {
            n02.b("size");
            n02.c(H1.h.l(this.f48701f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class k extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f48702f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f48703g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(float f10, float f11) {
            super(1);
            this.f48702f = f10;
            this.f48703g = f11;
        }

        public final void a(N0 n02) {
            n02.b("size");
            n02.getProperties().c("width", H1.h.l(this.f48702f));
            n02.getProperties().c("height", H1.h.l(this.f48703g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class l extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f48704f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f48705g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f48706h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f48707i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(float f10, float f11, float f12, float f13) {
            super(1);
            this.f48704f = f10;
            this.f48705g = f11;
            this.f48706h = f12;
            this.f48707i = f13;
        }

        public final void a(N0 n02) {
            n02.b("sizeIn");
            n02.getProperties().c("minWidth", H1.h.l(this.f48704f));
            n02.getProperties().c("minHeight", H1.h.l(this.f48705g));
            n02.getProperties().c("maxWidth", H1.h.l(this.f48706h));
            n02.getProperties().c("maxHeight", H1.h.l(this.f48707i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class m extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f48708f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(float f10) {
            super(1);
            this.f48708f = f10;
        }

        public final void a(N0 n02) {
            n02.b("width");
            n02.c(H1.h.l(this.f48708f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class n extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f48709f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f48710g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(float f10, float f11) {
            super(1);
            this.f48709f = f10;
            this.f48710g = f11;
        }

        public final void a(N0 n02) {
            n02.b("widthIn");
            n02.getProperties().c("min", H1.h.l(this.f48709f));
            n02.getProperties().c("max", H1.h.l(this.f48710g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    static {
        FillElement.Companion aVar = FillElement.INSTANCE;
        f48676a = aVar.c(1.0f);
        f48677b = aVar.a(1.0f);
        f48678c = aVar.b(1.0f);
        WrapContentElement.Companion aVar2 = WrapContentElement.INSTANCE;
        e.Companion companion = P0.e.INSTANCE;
        f48679d = aVar2.c(companion.g(), false);
        f48680e = aVar2.c(companion.k(), false);
        f48681f = aVar2.a(companion.i(), false);
        f48682g = aVar2.a(companion.l(), false);
        f48683h = aVar2.b(companion.e(), false);
        f48684i = aVar2.b(companion.o(), false);
    }

    public static final Modifier A(Modifier modifier, float f10, float f11) {
        return modifier.then(new SizeElement(f10, 0.0f, f11, 0.0f, true, L0.b() ? new n(f10, f11) : L0.a(), 10, null));
    }

    public static /* synthetic */ Modifier B(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = H1.h.INSTANCE.c();
        }
        if ((i10 & 2) != 0) {
            f11 = H1.h.INSTANCE.c();
        }
        return A(modifier, f10, f11);
    }

    public static final Modifier C(Modifier modifier, e.c cVar, boolean z10) {
        e.Companion companion = P0.e.INSTANCE;
        return modifier.then((!Intrinsics.e(cVar, companion.i()) || z10) ? (!Intrinsics.e(cVar, companion.l()) || z10) ? WrapContentElement.INSTANCE.a(cVar, z10) : f48682g : f48681f);
    }

    public static /* synthetic */ Modifier D(Modifier modifier, e.c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = P0.e.INSTANCE.i();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return C(modifier, cVar, z10);
    }

    public static final Modifier E(Modifier modifier, P0.e eVar, boolean z10) {
        e.Companion companion = P0.e.INSTANCE;
        return modifier.then((!Intrinsics.e(eVar, companion.e()) || z10) ? (!Intrinsics.e(eVar, companion.o()) || z10) ? WrapContentElement.INSTANCE.b(eVar, z10) : f48684i : f48683h);
    }

    public static /* synthetic */ Modifier F(Modifier modifier, P0.e eVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = P0.e.INSTANCE.e();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return E(modifier, eVar, z10);
    }

    public static final Modifier G(Modifier modifier, e.b bVar, boolean z10) {
        e.Companion companion = P0.e.INSTANCE;
        return modifier.then((!Intrinsics.e(bVar, companion.g()) || z10) ? (!Intrinsics.e(bVar, companion.k()) || z10) ? WrapContentElement.INSTANCE.c(bVar, z10) : f48680e : f48679d);
    }

    public static /* synthetic */ Modifier H(Modifier modifier, e.b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = P0.e.INSTANCE.g();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return G(modifier, bVar, z10);
    }

    public static final Modifier a(Modifier modifier, float f10, float f11) {
        return modifier.then(new UnspecifiedConstraintsElement(f10, f11, null));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = H1.h.INSTANCE.c();
        }
        if ((i10 & 2) != 0) {
            f11 = H1.h.INSTANCE.c();
        }
        return a(modifier, f10, f11);
    }

    public static final Modifier c(Modifier modifier, float f10) {
        return modifier.then(f10 == 1.0f ? f48677b : FillElement.INSTANCE.a(f10));
    }

    public static /* synthetic */ Modifier d(Modifier modifier, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return c(modifier, f10);
    }

    public static final Modifier e(Modifier modifier, float f10) {
        return modifier.then(f10 == 1.0f ? f48678c : FillElement.INSTANCE.b(f10));
    }

    public static /* synthetic */ Modifier f(Modifier modifier, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return e(modifier, f10);
    }

    public static final Modifier g(Modifier modifier, float f10) {
        return modifier.then(f10 == 1.0f ? f48676a : FillElement.INSTANCE.c(f10));
    }

    public static /* synthetic */ Modifier h(Modifier modifier, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return g(modifier, f10);
    }

    public static final Modifier i(Modifier modifier, float f10) {
        return modifier.then(new SizeElement(0.0f, f10, 0.0f, f10, true, L0.b() ? new a(f10) : L0.a(), 5, null));
    }

    public static final Modifier j(Modifier modifier, float f10, float f11) {
        return modifier.then(new SizeElement(0.0f, f10, 0.0f, f11, true, L0.b() ? new b(f10, f11) : L0.a(), 5, null));
    }

    public static /* synthetic */ Modifier k(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = H1.h.INSTANCE.c();
        }
        if ((i10 & 2) != 0) {
            f11 = H1.h.INSTANCE.c();
        }
        return j(modifier, f10, f11);
    }

    public static final Modifier l(Modifier modifier, float f10) {
        return modifier.then(new SizeElement(0.0f, f10, 0.0f, f10, false, L0.b() ? new c(f10) : L0.a(), 5, null));
    }

    public static final Modifier m(Modifier modifier, float f10, float f11) {
        return modifier.then(new SizeElement(0.0f, f10, 0.0f, f11, false, L0.b() ? new d(f10, f11) : L0.a(), 5, null));
    }

    public static /* synthetic */ Modifier n(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = H1.h.INSTANCE.c();
        }
        if ((i10 & 2) != 0) {
            f11 = H1.h.INSTANCE.c();
        }
        return m(modifier, f10, f11);
    }

    public static final Modifier q(Modifier modifier, float f10, float f11, float f12, float f13) {
        return modifier.then(new SizeElement(f10, f11, f12, f13, false, L0.b() ? new g(f10, f11, f12, f13) : L0.a(), null));
    }

    public static /* synthetic */ Modifier r(Modifier modifier, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = H1.h.INSTANCE.c();
        }
        if ((i10 & 2) != 0) {
            f11 = H1.h.INSTANCE.c();
        }
        if ((i10 & 4) != 0) {
            f12 = H1.h.INSTANCE.c();
        }
        if ((i10 & 8) != 0) {
            f13 = H1.h.INSTANCE.c();
        }
        return q(modifier, f10, f11, f12, f13);
    }

    public static final Modifier s(Modifier modifier, float f10) {
        return modifier.then(new SizeElement(f10, 0.0f, f10, 0.0f, false, L0.b() ? new h(f10) : L0.a(), 10, null));
    }

    public static final Modifier t(Modifier modifier, float f10, float f11) {
        return modifier.then(new SizeElement(f10, 0.0f, f11, 0.0f, false, L0.b() ? new i(f10, f11) : L0.a(), 10, null));
    }

    public static /* synthetic */ Modifier u(Modifier modifier, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = H1.h.INSTANCE.c();
        }
        if ((i10 & 2) != 0) {
            f11 = H1.h.INSTANCE.c();
        }
        return t(modifier, f10, f11);
    }

    public static final Modifier x(Modifier modifier, float f10, float f11, float f12, float f13) {
        return modifier.then(new SizeElement(f10, f11, f12, f13, true, L0.b() ? new l(f10, f11, f12, f13) : L0.a(), null));
    }

    public static /* synthetic */ Modifier y(Modifier modifier, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = H1.h.INSTANCE.c();
        }
        if ((i10 & 2) != 0) {
            f11 = H1.h.INSTANCE.c();
        }
        if ((i10 & 4) != 0) {
            f12 = H1.h.INSTANCE.c();
        }
        if ((i10 & 8) != 0) {
            f13 = H1.h.INSTANCE.c();
        }
        return x(modifier, f10, f11, f12, f13);
    }

    public static final Modifier z(Modifier modifier, float f10) {
        return modifier.then(new SizeElement(f10, 0.0f, f10, 0.0f, true, L0.b() ? new m(f10) : L0.a(), 10, null));
    }

    public static final Modifier o(Modifier modifier, float f10) {
        Function1 function1A;
        if (L0.b()) {
            function1A = new e(f10);
        } else {
            function1A = L0.a();
        }
        return modifier.then(new SizeElement(f10, f10, f10, f10, false, function1A, null));
    }

    public static final Modifier p(Modifier modifier, float f10, float f11) {
        Function1 function1A;
        if (L0.b()) {
            function1A = new f(f10, f11);
        } else {
            function1A = L0.a();
        }
        return modifier.then(new SizeElement(f10, f11, f10, f11, false, function1A, null));
    }

    public static final Modifier v(Modifier modifier, float f10) {
        Function1 function1A;
        if (L0.b()) {
            function1A = new j(f10);
        } else {
            function1A = L0.a();
        }
        return modifier.then(new SizeElement(f10, f10, f10, f10, true, function1A, null));
    }

    public static final Modifier w(Modifier modifier, float f10, float f11) {
        Function1 function1A;
        if (L0.b()) {
            function1A = new k(f10, f11);
        } else {
            function1A = L0.a();
        }
        return modifier.then(new SizeElement(f10, f11, f10, f11, true, function1A, null));
    }
}
