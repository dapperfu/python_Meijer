package L1;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.c0;
import androidx.compose.ui.platform.L0;
import androidx.compose.ui.platform.N0;
import androidx.compose.ui.platform.O0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002!\"B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00060\u0007R\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J4\u0010\u0012\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\b\u0018\u00010\u0007R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"LL1/n;", "LL1/k;", "<init>", "()V", "LL1/h;", "l", "()LL1/h;", "LL1/n$b;", "m", "()LL1/n$b;", "", "i", "Landroidx/compose/ui/Modifier;", "ref", "Lkotlin/Function1;", "LL1/g;", "Lkotlin/ExtensionFunctionType;", "constrainBlock", "k", "(Landroidx/compose/ui/Modifier;LL1/h;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "e", "LL1/n$b;", "referencesObject", "", "f", "I", "ChildrenStartIndex", "g", "childId", "Ljava/util/ArrayList;", "h", "Ljava/util/ArrayList;", "childrenRefs", "a", "b", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class n extends k {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private b referencesObject;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int ChildrenStartIndex;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int childId = this.ChildrenStartIndex;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<h> childrenRefs = new ArrayList<>();

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B(\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f*\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LL1/n$a;", "Landroidx/compose/ui/layout/c0;", "Landroidx/compose/ui/platform/O0;", "LL1/h;", "ref", "Lkotlin/Function1;", "LL1/g;", "", "Lkotlin/ExtensionFunctionType;", "constrainBlock", "<init>", "(LL1/h;Lkotlin/jvm/functions/Function1;)V", "LH1/d;", "", "parentData", "LL1/m;", "b", "(LH1/d;Ljava/lang/Object;)LL1/m;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "LL1/h;", "d", "Lkotlin/jvm/functions/Function1;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class a extends O0 implements c0 {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final h ref;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Function1<C4039g, Unit> constrainBlock;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "<anonymous>", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 5, 1})
        /* renamed from: L1.n$a$a, reason: collision with other inner class name */
        public static final class C0300a extends Lambda implements Function1<N0, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ h f17773f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1 f17774g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0300a(h hVar, Function1 function1) {
                super(1);
                this.f17773f = hVar;
                this.f17774g = function1;
            }

            public final void a(N0 n02) {
                Intrinsics.j(n02, "$this$null");
                n02.b("constrainAs");
                n02.getProperties().c("ref", this.f17773f);
                n02.getProperties().c("constrainBlock", this.f17774g);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
                a(n02);
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h ref, Function1<? super C4039g, Unit> constrainBlock) {
            super(L0.b() ? new C0300a(ref, constrainBlock) : L0.a());
            Intrinsics.j(ref, "ref");
            Intrinsics.j(constrainBlock, "constrainBlock");
            this.ref = ref;
            this.constrainBlock = constrainBlock;
        }

        @Override // androidx.compose.ui.layout.c0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m R(H1.d dVar, Object obj) {
            Intrinsics.j(dVar, "<this>");
            return new m(this.ref, this.constrainBlock);
        }

        public boolean equals(Object other) {
            Function1<C4039g, Unit> function1 = this.constrainBlock;
            a aVar = other instanceof a ? (a) other : null;
            return Intrinsics.e(function1, aVar != null ? aVar.constrainBlock : null);
        }

        public int hashCode() {
            return this.constrainBlock.hashCode();
        }

        @Override // androidx.compose.ui.Modifier.b, androidx.compose.ui.Modifier
        public boolean all(Function1<? super Modifier.b, Boolean> function1) {
            return c0.a.a(this, function1);
        }

        @Override // androidx.compose.ui.Modifier.b, androidx.compose.ui.Modifier
        public boolean any(Function1<? super Modifier.b, Boolean> function1) {
            return c0.a.b(this, function1);
        }

        @Override // androidx.compose.ui.Modifier.b, androidx.compose.ui.Modifier
        public <R> R foldIn(R r10, Function2<? super R, ? super Modifier.b, ? extends R> function2) {
            return (R) c0.a.c(this, r10, function2);
        }

        @Override // androidx.compose.ui.Modifier
        public Modifier then(Modifier modifier) {
            return c0.a.d(this, modifier);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0010\u0010\n\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0010\u0010\f\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0010\u0010\r\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\r\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"LL1/n$b;", "", "<init>", "(LL1/n;)V", "LL1/h;", "a", "()LL1/h;", "c", "d", "e", "f", "g", "h", "i", "j", "b", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f17775a;

        public b(n this$0) {
            Intrinsics.j(this$0, "this$0");
            this.f17775a = this$0;
        }

        public final h a() {
            return this.f17775a.l();
        }

        public final h b() {
            return this.f17775a.l();
        }

        public final h c() {
            return this.f17775a.l();
        }

        public final h d() {
            return this.f17775a.l();
        }

        public final h e() {
            return this.f17775a.l();
        }

        public final h f() {
            return this.f17775a.l();
        }

        public final h g() {
            return this.f17775a.l();
        }

        public final h h() {
            return this.f17775a.l();
        }

        public final h i() {
            return this.f17775a.l();
        }

        public final h j() {
            return this.f17775a.l();
        }
    }

    public final Modifier k(Modifier modifier, h ref, Function1<? super C4039g, Unit> constrainBlock) {
        Intrinsics.j(modifier, "<this>");
        Intrinsics.j(ref, "ref");
        Intrinsics.j(constrainBlock, "constrainBlock");
        return modifier.then(new a(ref, constrainBlock));
    }

    public final h l() {
        ArrayList<h> arrayList = this.childrenRefs;
        int i10 = this.childId;
        this.childId = i10 + 1;
        h hVar = (h) CollectionsKt.v0(arrayList, i10);
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(Integer.valueOf(this.childId));
        this.childrenRefs.add(hVar2);
        return hVar2;
    }

    public final b m() {
        b bVar = this.referencesObject;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.referencesObject = bVar2;
        return bVar2;
    }

    @PublishedApi
    public n() {
    }

    @Override // L1.k
    public void i() {
        super.i();
        this.childId = this.ChildrenStartIndex;
    }
}
