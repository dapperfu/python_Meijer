package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0015Bµ\u0001\u0012\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005\u0012\u001b\b\u0002\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005\u0012\u001b\b\u0002\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005\u0012\u001b\b\u0002\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005\u0012\u001b\b\u0002\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005\u0012\u001b\b\u0002\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R*\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R*\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R*\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R*\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R*\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R*\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/text/z;", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/y;", "", "Lkotlin/ExtensionFunctionType;", "onDone", "onGo", "onNext", "onPrevious", "onSearch", "onSend", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lkotlin/jvm/functions/Function1;", "b", "()Lkotlin/jvm/functions/Function1;", "c", "d", "e", "f", "g", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5693z {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    private static final C5693z f49803h = new C5693z(null, null, null, null, null, null, 63, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<InterfaceC5692y, Unit> onDone;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1<InterfaceC5692y, Unit> onGo;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function1<InterfaceC5692y, Unit> onNext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function1<InterfaceC5692y, Unit> onPrevious;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function1<InterfaceC5692y, Unit> onSearch;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Function1<InterfaceC5692y, Unit> onSend;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/z$a;", "", "<init>", "()V", "Landroidx/compose/foundation/text/z;", "Default", "Landroidx/compose/foundation/text/z;", "a", "()Landroidx/compose/foundation/text/z;", "getDefault$annotations", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.z$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final C5693z a() {
            return C5693z.f49803h;
        }
    }

    public C5693z() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C5693z)) {
            return false;
        }
        C5693z c5693z = (C5693z) other;
        return this.onDone == c5693z.onDone && this.onGo == c5693z.onGo && this.onNext == c5693z.onNext && this.onPrevious == c5693z.onPrevious && this.onSearch == c5693z.onSearch && this.onSend == c5693z.onSend;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5693z(Function1<? super InterfaceC5692y, Unit> function1, Function1<? super InterfaceC5692y, Unit> function12, Function1<? super InterfaceC5692y, Unit> function13, Function1<? super InterfaceC5692y, Unit> function14, Function1<? super InterfaceC5692y, Unit> function15, Function1<? super InterfaceC5692y, Unit> function16) {
        this.onDone = function1;
        this.onGo = function12;
        this.onNext = function13;
        this.onPrevious = function14;
        this.onSearch = function15;
        this.onSend = function16;
    }

    public final Function1<InterfaceC5692y, Unit> b() {
        return this.onDone;
    }

    public final Function1<InterfaceC5692y, Unit> c() {
        return this.onGo;
    }

    public final Function1<InterfaceC5692y, Unit> d() {
        return this.onNext;
    }

    public final Function1<InterfaceC5692y, Unit> e() {
        return this.onPrevious;
    }

    public final Function1<InterfaceC5692y, Unit> f() {
        return this.onSearch;
    }

    public final Function1<InterfaceC5692y, Unit> g() {
        return this.onSend;
    }

    public int hashCode() {
        Function1<InterfaceC5692y, Unit> function1 = this.onDone;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1<InterfaceC5692y, Unit> function12 = this.onGo;
        int iHashCode2 = (iHashCode + (function12 != null ? function12.hashCode() : 0)) * 31;
        Function1<InterfaceC5692y, Unit> function13 = this.onNext;
        int iHashCode3 = (iHashCode2 + (function13 != null ? function13.hashCode() : 0)) * 31;
        Function1<InterfaceC5692y, Unit> function14 = this.onPrevious;
        int iHashCode4 = (iHashCode3 + (function14 != null ? function14.hashCode() : 0)) * 31;
        Function1<InterfaceC5692y, Unit> function15 = this.onSearch;
        int iHashCode5 = (iHashCode4 + (function15 != null ? function15.hashCode() : 0)) * 31;
        Function1<InterfaceC5692y, Unit> function16 = this.onSend;
        return iHashCode5 + (function16 != null ? function16.hashCode() : 0);
    }

    public /* synthetic */ C5693z(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function1, (i10 & 2) != 0 ? null : function12, (i10 & 4) != 0 ? null : function13, (i10 & 8) != 0 ? null : function14, (i10 & 16) != 0 ? null : function15, (i10 & 32) != 0 ? null : function16);
    }
}
