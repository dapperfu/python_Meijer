package kotlin.reflect.jvm.internal.impl.descriptors;

import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class Visibilities {

    /* renamed from: a, reason: collision with root package name */
    public static final Visibilities f144557a = new Visibilities();

    /* renamed from: b, reason: collision with root package name */
    private static final Map<Visibility, Integer> f144558b;

    /* renamed from: c, reason: collision with root package name */
    private static final Public f144559c;

    public static final class Inherited extends Visibility {

        /* renamed from: c, reason: collision with root package name */
        public static final Inherited f144560c = new Inherited();

        private Inherited() {
            super("inherited", false);
        }
    }

    public static final class Internal extends Visibility {

        /* renamed from: c, reason: collision with root package name */
        public static final Internal f144561c = new Internal();

        private Internal() {
            super("internal", false);
        }
    }

    public static final class InvisibleFake extends Visibility {

        /* renamed from: c, reason: collision with root package name */
        public static final InvisibleFake f144562c = new InvisibleFake();

        private InvisibleFake() {
            super("invisible_fake", false);
        }
    }

    public static final class Local extends Visibility {

        /* renamed from: c, reason: collision with root package name */
        public static final Local f144563c = new Local();

        private Local() {
            super("local", false);
        }
    }

    public static final class Private extends Visibility {

        /* renamed from: c, reason: collision with root package name */
        public static final Private f144564c = new Private();

        private Private() {
            super("private", false);
        }
    }

    public static final class PrivateToThis extends Visibility {

        /* renamed from: c, reason: collision with root package name */
        public static final PrivateToThis f144565c = new PrivateToThis();

        private PrivateToThis() {
            super("private_to_this", false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public String b() {
            return "private/*private to this*/";
        }
    }

    public static final class Protected extends Visibility {

        /* renamed from: c, reason: collision with root package name */
        public static final Protected f144566c = new Protected();

        private Protected() {
            super("protected", true);
        }
    }

    public static final class Public extends Visibility {

        /* renamed from: c, reason: collision with root package name */
        public static final Public f144567c = new Public();

        private Public() {
            super("public", true);
        }
    }

    public static final class Unknown extends Visibility {

        /* renamed from: c, reason: collision with root package name */
        public static final Unknown f144568c = new Unknown();

        private Unknown() {
            super(zzbz.UNKNOWN_CONTENT_TYPE, false);
        }
    }

    static {
        Map mapD = MapsKt.d();
        mapD.put(PrivateToThis.f144565c, 0);
        mapD.put(Private.f144564c, 0);
        mapD.put(Internal.f144561c, 1);
        mapD.put(Protected.f144566c, 1);
        Public r12 = Public.f144567c;
        mapD.put(r12, 2);
        f144558b = MapsKt.c(mapD);
        f144559c = r12;
    }

    public final Integer a(Visibility first, Visibility second) {
        Intrinsics.j(first, "first");
        Intrinsics.j(second, "second");
        if (first == second) {
            return 0;
        }
        Map<Visibility, Integer> map = f144558b;
        Integer num = map.get(first);
        Integer num2 = map.get(second);
        if (num == null || num2 == null || Intrinsics.e(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean b(Visibility visibility) {
        Intrinsics.j(visibility, "visibility");
        return visibility == Private.f144564c || visibility == PrivateToThis.f144565c;
    }

    private Visibilities() {
    }
}
