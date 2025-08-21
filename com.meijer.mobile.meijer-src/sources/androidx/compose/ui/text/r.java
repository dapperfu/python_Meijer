package androidx.compose.ui.text;

import F1.f;
import F1.s;
import androidx.compose.ui.text.PlatformParagraphStyle;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\" \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\" \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004\" \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0004\"$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\r\"$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0000*\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0010\"$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\u0000*\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, d2 = {"LL0/k;", "Landroidx/compose/ui/text/p;", "", "a", "LL0/k;", "PlatformParagraphStyleSaver", "LF1/f;", "b", "LineBreakSaver", "LF1/s;", "c", "TextMotionSaver", "Landroidx/compose/ui/text/p$a;", "(Landroidx/compose/ui/text/p$a;)LL0/k;", "Saver", "LF1/f$a;", "(LF1/f$a;)LL0/k;", "LF1/s$a;", "(LF1/s$a;)LL0/k;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final L0.k<PlatformParagraphStyle, Object> f52863a = L0.l.a(c.f52868f, d.f52869f);

    /* renamed from: b, reason: collision with root package name */
    private static final L0.k<F1.f, Object> f52864b = L0.l.a(a.f52866f, b.f52867f);

    /* renamed from: c, reason: collision with root package name */
    private static final L0.k<F1.s, Object> f52865c = L0.l.a(e.f52870f, f.f52871f);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "LF1/f;", "it", "", "a", "(LL0/m;I)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function2<L0.m, F1.f, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f52866f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(L0.m mVar, F1.f fVar) {
            return a(mVar, fVar.getMask());
        }

        public final Object a(L0.m mVar, int i10) {
            return Integer.valueOf(i10);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LF1/f;", "a", "(Ljava/lang/Object;)LF1/f;"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<Object, F1.f> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f52867f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F1.f invoke(Object obj) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
            return F1.f.c(F1.f.d(((Integer) obj).intValue()));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/p;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/p;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class d extends Lambda implements Function1<Object, PlatformParagraphStyle> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f52869f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PlatformParagraphStyle invoke(Object obj) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Boolean bool = obj2 != null ? (Boolean) obj2 : null;
            Intrinsics.g(bool);
            boolean zBooleanValue = bool.booleanValue();
            Object obj3 = list.get(1);
            androidx.compose.ui.text.e eVar = obj3 != null ? (androidx.compose.ui.text.e) obj3 : null;
            Intrinsics.g(eVar);
            return new PlatformParagraphStyle(eVar.getValue(), zBooleanValue, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LF1/s;", "a", "(Ljava/lang/Object;)LF1/s;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class f extends Lambda implements Function1<Object, F1.s> {

        /* renamed from: f, reason: collision with root package name */
        public static final f f52871f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F1.s invoke(Object obj) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            s.b bVar = obj2 != null ? (s.b) obj2 : null;
            Intrinsics.g(bVar);
            int value = bVar.getValue();
            Object obj3 = list.get(1);
            Boolean bool = obj3 != null ? (Boolean) obj3 : null;
            Intrinsics.g(bool);
            return new F1.s(value, bool.booleanValue(), null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "Landroidx/compose/ui/text/p;", "it", "", "a", "(LL0/m;Landroidx/compose/ui/text/p;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function2<L0.m, PlatformParagraphStyle, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f52868f = new c();

        c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.m mVar, PlatformParagraphStyle platformParagraphStyle) {
            return CollectionsKt.g(q.y(Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding())), q.y(androidx.compose.ui.text.e.d(platformParagraphStyle.getEmojiSupportMatch())));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "LF1/s;", "it", "", "a", "(LL0/m;LF1/s;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function2<L0.m, F1.s, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f52870f = new e();

        e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.m mVar, F1.s sVar) {
            return CollectionsKt.g(q.y(s.b.d(sVar.getLinearity())), q.y(Boolean.valueOf(sVar.getSubpixelTextPositioning())));
        }
    }

    public static final L0.k<F1.f, Object> a(f.Companion companion) {
        return f52864b;
    }

    public static final L0.k<F1.s, Object> b(s.Companion companion) {
        return f52865c;
    }

    public static final L0.k<PlatformParagraphStyle, Object> c(PlatformParagraphStyle.Companion companion) {
        return f52863a;
    }
}
