package Cu;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R)\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR)\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\nR)\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"LCu/d;", "", "<init>", "()V", "Lkotlin/Function2;", "LCu/h;", "LCu/i;", "", "b", "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "Start", "c", "a", "Center", "d", "getEnd", "End", "lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f4921a = new d();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Function2<h, SnapperLayoutItemInfo, Integer> Start = c.f4927f;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Function2<h, SnapperLayoutItemInfo, Integer> Center = a.f4925f;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final Function2<h, SnapperLayoutItemInfo, Integer> End = b.f4926f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LCu/h;", "layout", "LCu/i;", "item", "", "a", "(LCu/h;LCu/i;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function2<h, SnapperLayoutItemInfo, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f4925f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(h layout, SnapperLayoutItemInfo item) {
            Intrinsics.j(layout, "layout");
            Intrinsics.j(item, "item");
            return Integer.valueOf(layout.g() + (((layout.f() - layout.g()) - item.c()) / 2));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LCu/h;", "layout", "LCu/i;", "item", "", "a", "(LCu/h;LCu/i;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function2<h, SnapperLayoutItemInfo, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f4926f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(h layout, SnapperLayoutItemInfo item) {
            Intrinsics.j(layout, "layout");
            Intrinsics.j(item, "item");
            return Integer.valueOf(layout.f() - item.c());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LCu/h;", "layout", "LCu/i;", "<anonymous parameter 1>", "", "a", "(LCu/h;LCu/i;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function2<h, SnapperLayoutItemInfo, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f4927f = new c();

        c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(h layout, SnapperLayoutItemInfo snapperLayoutItemInfo) {
            Intrinsics.j(layout, "layout");
            Intrinsics.j(snapperLayoutItemInfo, "<anonymous parameter 1>");
            return Integer.valueOf(layout.g());
        }
    }

    public final Function2<h, SnapperLayoutItemInfo, Integer> a() {
        return Center;
    }

    public final Function2<h, SnapperLayoutItemInfo, Integer> b() {
        return Start;
    }

    private d() {
    }
}
