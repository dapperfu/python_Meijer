package E2;

import B2.InterfaceC2941f;
import B2.InterfaceC2943h;
import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001BI\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R,\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"LE2/c;", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "LB2/h;", "LF2/f;", "", "name", "LC2/b;", "corruptionHandler", "Lkotlin/Function1;", "", "LB2/f;", "produceMigrations", "Lqv/O;", "scope", "<init>", "(Ljava/lang/String;LC2/b;Lkotlin/jvm/functions/Function1;Lqv/O;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", "b", "(Landroid/content/Context;Lkotlin/reflect/KProperty;)LB2/h;", "a", "Ljava/lang/String;", "LC2/b;", "c", "Lkotlin/jvm/functions/Function1;", "d", "Lqv/O;", "", "e", "Ljava/lang/Object;", "lock", "f", "LB2/h;", "INSTANCE", "datastore-preferences_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c implements ReadOnlyProperty<Context, InterfaceC2943h<F2.f>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C2.b<F2.f> corruptionHandler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function1<Context, List<InterfaceC2941f<F2.f>>> produceMigrations;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O scope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private volatile InterfaceC2943h<F2.f> INSTANCE;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/io/File;", "c", "()Ljava/io/File;"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements Function0<File> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f7585f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c f7586g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f7585f = context;
            this.f7586g = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f7585f;
            Intrinsics.i(applicationContext, "applicationContext");
            return b.a(applicationContext, this.f7586g.name);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(String name, C2.b<F2.f> bVar, Function1<? super Context, ? extends List<? extends InterfaceC2941f<F2.f>>> produceMigrations, InterfaceC16622O scope) {
        Intrinsics.j(name, "name");
        Intrinsics.j(produceMigrations, "produceMigrations");
        Intrinsics.j(scope, "scope");
        this.name = name;
        this.corruptionHandler = bVar;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC2943h<F2.f> getValue(Context thisRef, KProperty<?> property) {
        InterfaceC2943h<F2.f> interfaceC2943h;
        Intrinsics.j(thisRef, "thisRef");
        Intrinsics.j(property, "property");
        InterfaceC2943h<F2.f> interfaceC2943h2 = this.INSTANCE;
        if (interfaceC2943h2 != null) {
            return interfaceC2943h2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    F2.e eVar = F2.e.f10226a;
                    C2.b<F2.f> bVar = this.corruptionHandler;
                    Function1<Context, List<InterfaceC2941f<F2.f>>> function1 = this.produceMigrations;
                    Intrinsics.i(applicationContext, "applicationContext");
                    this.INSTANCE = eVar.b(bVar, function1.invoke(applicationContext), this.scope, new a(applicationContext, this));
                }
                interfaceC2943h = this.INSTANCE;
                Intrinsics.g(interfaceC2943h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC2943h;
    }
}
