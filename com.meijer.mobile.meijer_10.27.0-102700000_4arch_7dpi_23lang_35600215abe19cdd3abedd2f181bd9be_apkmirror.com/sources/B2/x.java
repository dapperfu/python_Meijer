package B2;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LB2/x;", "", "<init>", "()V", "T", "LB2/D;", "serializer", "LC2/b;", "corruptionHandler", "", "LB2/f;", "migrations", "Lqv/O;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "LB2/h;", "a", "(LB2/D;LC2/b;Ljava/util/List;Lqv/O;Lkotlin/jvm/functions/Function0;)LB2/h;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f2020a = new x();

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ljava/io/File;", "it", "LB2/s;", "a", "(Ljava/io/File;)LB2/s;"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements Function1<File, s> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f2021f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC16622O interfaceC16622O) {
            super(1);
            this.f2021f = interfaceC16622O;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s invoke(File it) {
            Intrinsics.j(it, "it");
            return new w(this.f2021f.getCoroutineContext(), it);
        }
    }

    @JvmOverloads
    public final <T> InterfaceC2943h<T> a(D<T> serializer, C2.b<T> corruptionHandler, List<? extends InterfaceC2941f<T>> migrations, InterfaceC16622O scope, Function0<? extends File> produceFile) {
        Intrinsics.j(serializer, "serializer");
        Intrinsics.j(migrations, "migrations");
        Intrinsics.j(scope, "scope");
        Intrinsics.j(produceFile, "produceFile");
        C2949n c2949n = new C2949n(serializer, new a(scope), produceFile);
        List listE = CollectionsKt.e(C2942g.INSTANCE.b(migrations));
        if (corruptionHandler == null) {
            corruptionHandler = (C2.b<T>) new C2.a();
        }
        return new C2945j(c2949n, listE, corruptionHandler, scope);
    }

    private x() {
    }
}
