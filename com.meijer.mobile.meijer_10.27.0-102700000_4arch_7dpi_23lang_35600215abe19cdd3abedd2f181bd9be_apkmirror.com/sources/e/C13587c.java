package e;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.J;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import e.C13587c;
import g.AbstractC14149e;
import g.InterfaceC14146b;
import g.InterfaceC14150f;
import h.AbstractC14314a;
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
public final class C13587c {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"I", "O", "Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "b", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension
    /* renamed from: e.c$a */
    static final class a extends Lambda implements Function1<F, E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C13585a<I> f127642f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC14149e f127643g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f127644h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ AbstractC14314a<I, O> f127645i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ z1<Function1<O, Unit>> f127646j;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"e/c$a$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: e.c$a$a, reason: collision with other inner class name */
        public static final class C2011a implements E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C13585a f127647a;

            public C2011a(C13585a c13585a) {
                this.f127647a = c13585a;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                this.f127647a.c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(C13585a<I> c13585a, AbstractC14149e abstractC14149e, String str, AbstractC14314a<I, O> abstractC14314a, z1<? extends Function1<? super O, Unit>> z1Var) {
            super(1);
            this.f127642f = c13585a;
            this.f127643g = abstractC14149e;
            this.f127644h = str;
            this.f127645i = abstractC14314a;
            this.f127646j = z1Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final E invoke(F f10) {
            C13585a<I> c13585a = this.f127642f;
            AbstractC14149e abstractC14149e = this.f127643g;
            String str = this.f127644h;
            Object obj = this.f127645i;
            final z1<Function1<O, Unit>> z1Var = this.f127646j;
            c13585a.b(abstractC14149e.m(str, obj, new InterfaceC14146b() { // from class: e.b
                @Override // g.InterfaceC14146b
                public final void a(Object obj2) {
                    C13587c.a.c(z1Var, obj2);
                }
            }));
            return new C2011a(this.f127642f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(z1 z1Var, Object obj) {
            ((Function1) z1Var.getValue()).invoke(obj);
        }
    }

    public static final <I, O> C13593i<I, O> a(AbstractC14314a<I, O> abstractC14314a, Function1<? super O, Unit> function1, Composer composer, int i10) {
        AbstractC14149e abstractC14149e;
        String str;
        if (ComposerKt.M()) {
            ComposerKt.U(-1408504823, i10, -1, "androidx.activity.compose.rememberLauncherForActivityResult (ActivityResultRegistry.kt:82)");
        }
        z1 z1VarP = o1.p(abstractC14314a, composer, i10 & 14);
        z1 z1VarP2 = o1.p(function1, composer, (i10 >> 3) & 14);
        String str2 = (String) L0.c.c(new Object[0], null, null, b.f127648f, composer, 3072, 6);
        InterfaceC14150f interfaceC14150fA = C13591g.f127663a.a(composer, 6);
        if (interfaceC14150fA == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        AbstractC14149e activityResultRegistry = interfaceC14150fA.getActivityResultRegistry();
        Object objB = composer.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            objB = new C13585a();
            composer.t(objB);
        }
        C13585a c13585a = (C13585a) objB;
        Object objB2 = composer.B();
        if (objB2 == companion.a()) {
            objB2 = new C13593i(c13585a, z1VarP);
            composer.t(objB2);
        }
        C13593i<I, O> c13593i = (C13593i) objB2;
        boolean zD = composer.D(c13585a) | composer.D(activityResultRegistry) | composer.V(str2) | composer.D(abstractC14314a) | composer.V(z1VarP2);
        Object objB3 = composer.B();
        if (zD || objB3 == companion.a()) {
            abstractC14149e = activityResultRegistry;
            Object aVar = new a(c13585a, abstractC14149e, str2, abstractC14314a, z1VarP2);
            str = str2;
            composer.t(aVar);
            objB3 = aVar;
        } else {
            str = str2;
            abstractC14149e = activityResultRegistry;
        }
        AbstractC14149e abstractC14149e2 = abstractC14149e;
        J.a(abstractC14149e2, str, abstractC14314a, (Function1) objB3, composer, (i10 << 6) & 896);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c13593i;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "O", "", "c", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: e.c$b */
    static final class b extends Lambda implements Function0<String> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f127648f = new b();

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
