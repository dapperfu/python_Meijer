package E2;

import B2.InterfaceC2941f;
import B2.InterfaceC2943h;
import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.properties.ReadOnlyProperty;
import qv.C16623P;
import qv.C16639f0;
import qv.InterfaceC16622O;
import qv.X0;

@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ae\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00070\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "name", "LC2/b;", "LF2/f;", "corruptionHandler", "Lkotlin/Function1;", "Landroid/content/Context;", "", "LB2/f;", "produceMigrations", "Lqv/O;", "scope", "Lkotlin/properties/ReadOnlyProperty;", "LB2/h;", "a", "(Ljava/lang/String;LC2/b;Lkotlin/jvm/functions/Function1;Lqv/O;)Lkotlin/properties/ReadOnlyProperty;", "datastore-preferences_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/content/Context;", "it", "", "LB2/f;", "LF2/f;", "a", "(Landroid/content/Context;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: E2.a$a, reason: collision with other inner class name */
    public static final class C0124a extends Lambda implements Function1<Context, List<? extends InterfaceC2941f<F2.f>>> {

        /* renamed from: f, reason: collision with root package name */
        public static final C0124a f7578f = new C0124a();

        C0124a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<InterfaceC2941f<F2.f>> invoke(Context it) {
            Intrinsics.j(it, "it");
            return CollectionsKt.m();
        }
    }

    public static final ReadOnlyProperty<Context, InterfaceC2943h<F2.f>> a(String name, C2.b<F2.f> bVar, Function1<? super Context, ? extends List<? extends InterfaceC2941f<F2.f>>> produceMigrations, InterfaceC16622O scope) {
        Intrinsics.j(name, "name");
        Intrinsics.j(produceMigrations, "produceMigrations");
        Intrinsics.j(scope, "scope");
        return new c(name, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ ReadOnlyProperty b(String str, C2.b bVar, Function1 function1, InterfaceC16622O interfaceC16622O, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            function1 = C0124a.f7578f;
        }
        if ((i10 & 8) != 0) {
            interfaceC16622O = C16623P.a(C16639f0.b().m0(X0.b(null, 1, null)));
        }
        return a(str, bVar, function1, interfaceC16622O);
    }
}
