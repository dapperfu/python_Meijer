package e;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.J;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import e.C13735c;
import g.AbstractC14278e;
import g.InterfaceC14275b;
import g.InterfaceC14279f;
import h.AbstractC14427a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"I", "O", "Lh/a;", "contract", "Lkotlin/Function1;", "", "onResult", "Le/i;", "a", "(Lh/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Le/i;", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: e.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13735c {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"I", "O", "Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "b", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension
    /* renamed from: e.c$a */
    static final class a extends Lambda implements Function1<F, E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C13733a<I> f128978f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC14278e f128979g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f128980h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ AbstractC14427a<I, O> f128981i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ z1<Function1<O, Unit>> f128982j;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"e/c$a$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: e.c$a$a, reason: collision with other inner class name */
        public static final class C2032a implements E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C13733a f128983a;

            public C2032a(C13733a c13733a) {
                this.f128983a = c13733a;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                this.f128983a.c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(C13733a<I> c13733a, AbstractC14278e abstractC14278e, String str, AbstractC14427a<I, O> abstractC14427a, z1<? extends Function1<? super O, Unit>> z1Var) {
            super(1);
            this.f128978f = c13733a;
            this.f128979g = abstractC14278e;
            this.f128980h = str;
            this.f128981i = abstractC14427a;
            this.f128982j = z1Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final E invoke(F f10) {
            C13733a<I> c13733a = this.f128978f;
            AbstractC14278e abstractC14278e = this.f128979g;
            String str = this.f128980h;
            Object obj = this.f128981i;
            final z1<Function1<O, Unit>> z1Var = this.f128982j;
            c13733a.b(abstractC14278e.m(str, obj, new InterfaceC14275b() { // from class: e.b
                @Override // g.InterfaceC14275b
                public final void a(Object obj2) {
                    C13735c.a.c(z1Var, obj2);
                }
            }));
            return new C2032a(this.f128978f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(z1 z1Var, Object obj) {
            ((Function1) z1Var.getValue()).invoke(obj);
        }
    }

    public static final <I, O> C13741i<I, O> a(AbstractC14427a<I, O> abstractC14427a, Function1<? super O, Unit> function1, Composer composer, int i10) {
        AbstractC14278e abstractC14278e;
        String str;
        if (ComposerKt.M()) {
            ComposerKt.U(-1408504823, i10, -1, "androidx.activity.compose.rememberLauncherForActivityResult (ActivityResultRegistry.kt:82)");
        }
        z1 z1VarP = o1.p(abstractC14427a, composer, i10 & 14);
        z1 z1VarP2 = o1.p(function1, composer, (i10 >> 3) & 14);
        String str2 = (String) L0.c.c(new Object[0], null, null, b.f128984f, composer, 3072, 6);
        InterfaceC14279f interfaceC14279fA = C13739g.f128999a.a(composer, 6);
        if (interfaceC14279fA == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        AbstractC14278e activityResultRegistry = interfaceC14279fA.getActivityResultRegistry();
        Object objB = composer.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            objB = new C13733a();
            composer.t(objB);
        }
        C13733a c13733a = (C13733a) objB;
        Object objB2 = composer.B();
        if (objB2 == companion.a()) {
            objB2 = new C13741i(c13733a, z1VarP);
            composer.t(objB2);
        }
        C13741i<I, O> c13741i = (C13741i) objB2;
        boolean zD = composer.D(c13733a) | composer.D(activityResultRegistry) | composer.V(str2) | composer.D(abstractC14427a) | composer.V(z1VarP2);
        Object objB3 = composer.B();
        if (zD || objB3 == companion.a()) {
            abstractC14278e = activityResultRegistry;
            Object aVar = new a(c13733a, abstractC14278e, str2, abstractC14427a, z1VarP2);
            str = str2;
            composer.t(aVar);
            objB3 = aVar;
        } else {
            str = str2;
            abstractC14278e = activityResultRegistry;
        }
        AbstractC14278e abstractC14278e2 = abstractC14278e;
        J.a(abstractC14278e2, str, abstractC14427a, (Function1) objB3, composer, (i10 << 6) & 896);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c13741i;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "O", "", "c", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: e.c$b */
    static final class b extends Lambda implements Function0<String> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f128984f = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }
}
