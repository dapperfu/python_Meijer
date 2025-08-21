package kotlin;

import V2.CreationExtras;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.view.AbstractC6152a;
import androidx.view.AbstractC6165l;
import androidx.view.C6138L;
import androidx.view.C6141O;
import androidx.view.C6146U;
import androidx.view.C6174u;
import androidx.view.InterfaceC6162j;
import androidx.view.InterfaceC6172s;
import androidx.view.c0;
import androidx.view.f0;
import androidx.view.g0;
import androidx.view.h0;
import io.constructor.data.local.PreferencesHelper;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import x4.C18086f;
import x4.C18088h;
import x4.InterfaceC18089i;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 h2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003+-3BS\b\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013B\u001d\b\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0000\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010*R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010\b\u001a\u00020\u00078\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00107R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010*R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00104R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010<R\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010?R\u0016\u0010B\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b5\u0010FR\u001b\u0010K\u001a\u00020H8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010E\u001a\u0004\bI\u0010JR*\u0010P\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u000b8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\bM\u00106\u001a\u0004\b:\u0010N\"\u0004\bD\u0010OR\u001a\u0010V\u001a\u00020Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b3\u0010WR\u0014\u0010[\u001a\u00020X8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010f¨\u0006i"}, d2 = {"Li4/h;", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/h0;", "Landroidx/lifecycle/j;", "Lx4/i;", "Landroid/content/Context;", "context", "Li4/p;", "destination", "Landroid/os/Bundle;", "immutableArgs", "Landroidx/lifecycle/l$b;", "hostLifecycleState", "Li4/A;", "viewModelStoreProvider", "", PreferencesHelper.PREF_ID, "savedState", "<init>", "(Landroid/content/Context;Li4/p;Landroid/os/Bundle;Landroidx/lifecycle/l$b;Li4/A;Ljava/lang/String;Landroid/os/Bundle;)V", "entry", "arguments", "(Li4/h;Landroid/os/Bundle;)V", "Landroidx/lifecycle/l$a;", "event", "", "h", "(Landroidx/lifecycle/l$a;)V", "l", "()V", "outBundle", "i", "(Landroid/os/Bundle;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Landroid/content/Context;", "b", "Li4/p;", "e", "()Li4/p;", "j", "(Li4/p;)V", "c", "Landroid/os/Bundle;", "d", "Landroidx/lifecycle/l$b;", "Li4/A;", "f", "Ljava/lang/String;", "g", "Landroidx/lifecycle/u;", "Landroidx/lifecycle/u;", "_lifecycle", "Lx4/h;", "Lx4/h;", "savedStateRegistryController", "Z", "savedStateRegistryAttached", "Landroidx/lifecycle/U;", "k", "Lkotlin/Lazy;", "()Landroidx/lifecycle/U;", "defaultFactory", "Landroidx/lifecycle/L;", "getSavedStateHandle", "()Landroidx/lifecycle/L;", "savedStateHandle", "maxState", "m", "()Landroidx/lifecycle/l$b;", "(Landroidx/lifecycle/l$b;)V", "maxLifecycle", "Landroidx/lifecycle/f0$c;", "n", "Landroidx/lifecycle/f0$c;", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/f0$c;", "defaultViewModelProviderFactory", "()Landroid/os/Bundle;", "Landroidx/lifecycle/l;", "getLifecycle", "()Landroidx/lifecycle/l;", "lifecycle", "Landroidx/lifecycle/g0;", "getViewModelStore", "()Landroidx/lifecycle/g0;", "viewModelStore", "LV2/a;", "getDefaultViewModelCreationExtras", "()LV2/a;", "defaultViewModelCreationExtras", "Lx4/f;", "getSavedStateRegistry", "()Lx4/f;", "savedStateRegistry", "o", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: i4.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14667h implements InterfaceC6172s, h0, InterfaceC6162j, InterfaceC18089i {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private C14675p destination;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Bundle immutableArgs;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private AbstractC6165l.b hostLifecycleState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14655A viewModelStoreProvider;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Bundle savedState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private C6174u _lifecycle;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C18088h savedStateRegistryController;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean savedStateRegistryAttached;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy defaultFactory;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy savedStateHandle;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private AbstractC6165l.b maxLifecycle;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final f0.c defaultViewModelProviderFactory;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0012\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Li4/h$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Li4/p;", "destination", "Landroid/os/Bundle;", "arguments", "Landroidx/lifecycle/l$b;", "hostLifecycleState", "Li4/A;", "viewModelStoreProvider", "", PreferencesHelper.PREF_ID, "savedState", "Li4/h;", "a", "(Landroid/content/Context;Li4/p;Landroid/os/Bundle;Landroidx/lifecycle/l$b;Li4/A;Ljava/lang/String;Landroid/os/Bundle;)Li4/h;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i4.h$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ C14667h b(Companion companion, Context context, C14675p c14675p, Bundle bundle, AbstractC6165l.b bVar, InterfaceC14655A interfaceC14655A, String str, Bundle bundle2, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                bundle = null;
            }
            if ((i10 & 8) != 0) {
                bVar = AbstractC6165l.b.f55501c;
            }
            if ((i10 & 16) != 0) {
                interfaceC14655A = null;
            }
            if ((i10 & 32) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics.i(str, "randomUUID().toString()");
            }
            if ((i10 & 64) != 0) {
                bundle2 = null;
            }
            return companion.a(context, c14675p, bundle, bVar, interfaceC14655A, str, bundle2);
        }

        public final C14667h a(Context context, C14675p destination, Bundle arguments, AbstractC6165l.b hostLifecycleState, InterfaceC14655A viewModelStoreProvider, String id2, Bundle savedState) {
            Intrinsics.j(destination, "destination");
            Intrinsics.j(hostLifecycleState, "hostLifecycleState");
            Intrinsics.j(id2, "id");
            return new C14667h(context, destination, arguments, hostLifecycleState, viewModelStoreProvider, id2, savedState, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Li4/h$b;", "Landroidx/lifecycle/a;", "Lx4/i;", "owner", "<init>", "(Lx4/i;)V", "Landroidx/lifecycle/c0;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/L;", "handle", "c", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/L;)Landroidx/lifecycle/c0;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i4.h$b */
    private static final class b extends AbstractC6152a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC18089i owner) {
            super(owner, null);
            Intrinsics.j(owner, "owner");
        }

        @Override // androidx.view.AbstractC6152a
        protected <T extends c0> T c(String key, Class<T> modelClass, C6138L handle) {
            Intrinsics.j(key, "key");
            Intrinsics.j(modelClass, "modelClass");
            Intrinsics.j(handle, "handle");
            return new c(handle);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li4/h$c;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/L;", "handle", "<init>", "(Landroidx/lifecycle/L;)V", "a", "Landroidx/lifecycle/L;", "m", "()Landroidx/lifecycle/L;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i4.h$c */
    private static final class c extends c0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final C6138L handle;

        public c(C6138L handle) {
            Intrinsics.j(handle, "handle");
            this.handle = handle;
        }

        /* renamed from: m, reason: from getter */
        public final C6138L getHandle() {
            return this.handle;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/U;", "c", "()Landroidx/lifecycle/U;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.h$d */
    static final class d extends Lambda implements Function0<C6146U> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C6146U invoke() {
            Context context = C14667h.this.context;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            C14667h c14667h = C14667h.this;
            return new C6146U(application, c14667h, c14667h.c());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/L;", "c", "()Landroidx/lifecycle/L;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.h$e */
    static final class e extends Lambda implements Function0<C6138L> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C6138L invoke() {
            if (!C14667h.this.savedStateRegistryAttached) {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            }
            if (C14667h.this.getLifecycle().getState() != AbstractC6165l.b.f55499a) {
                return ((c) new f0(C14667h.this, new b(C14667h.this)).a(c.class)).getHandle();
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
        }
    }

    public /* synthetic */ C14667h(Context context, C14675p c14675p, Bundle bundle, AbstractC6165l.b bVar, InterfaceC14655A interfaceC14655A, String str, Bundle bundle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, c14675p, bundle, bVar, interfaceC14655A, str, bundle2);
    }

    public boolean equals(Object other) {
        Set<String> setKeySet;
        if (other != null && (other instanceof C14667h)) {
            C14667h c14667h = (C14667h) other;
            if (Intrinsics.e(this.id, c14667h.id) && Intrinsics.e(this.destination, c14667h.destination) && Intrinsics.e(getLifecycle(), c14667h.getLifecycle()) && Intrinsics.e(getSavedStateRegistry(), c14667h.getSavedStateRegistry())) {
                if (Intrinsics.e(this.immutableArgs, c14667h.immutableArgs)) {
                    return true;
                }
                Bundle bundle = this.immutableArgs;
                if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        Object obj = this.immutableArgs.get(str);
                        Bundle bundle2 = c14667h.immutableArgs;
                        if (!Intrinsics.e(obj, bundle2 != null ? bundle2.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private C14667h(Context context, C14675p c14675p, Bundle bundle, AbstractC6165l.b bVar, InterfaceC14655A interfaceC14655A, String str, Bundle bundle2) {
        this.context = context;
        this.destination = c14675p;
        this.immutableArgs = bundle;
        this.hostLifecycleState = bVar;
        this.viewModelStoreProvider = interfaceC14655A;
        this.id = str;
        this.savedState = bundle2;
        this._lifecycle = new C6174u(this);
        this.savedStateRegistryController = C18088h.INSTANCE.b(this);
        this.defaultFactory = LazyKt.b(new d());
        this.savedStateHandle = LazyKt.b(new e());
        this.maxLifecycle = AbstractC6165l.b.f55500b;
        this.defaultViewModelProviderFactory = d();
    }

    private final C6146U d() {
        return (C6146U) this.defaultFactory.getValue();
    }

    public final Bundle c() {
        if (this.immutableArgs == null) {
            return null;
        }
        return new Bundle(this.immutableArgs);
    }

    /* renamed from: e, reason: from getter */
    public final C14675p getDestination() {
        return this.destination;
    }

    /* renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: g, reason: from getter */
    public final AbstractC6165l.b getMaxLifecycle() {
        return this.maxLifecycle;
    }

    @Override // androidx.view.InterfaceC6162j
    public CreationExtras getDefaultViewModelCreationExtras() {
        V2.b bVar = new V2.b(null, 1, null);
        Context context = this.context;
        Object applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            bVar.c(f0.a.f55485h, application);
        }
        bVar.c(C6141O.f55430a, this);
        bVar.c(C6141O.f55431b, this);
        Bundle bundleC = c();
        if (bundleC != null) {
            bVar.c(C6141O.f55432c, bundleC);
        }
        return bVar;
    }

    @Override // androidx.view.InterfaceC6162j
    public f0.c getDefaultViewModelProviderFactory() {
        return this.defaultViewModelProviderFactory;
    }

    @Override // androidx.view.InterfaceC6172s
    public AbstractC6165l getLifecycle() {
        return this._lifecycle;
    }

    @Override // x4.InterfaceC18089i
    public C18086f getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // androidx.view.h0
    /* renamed from: getViewModelStore */
    public g0 getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String() {
        if (!this.savedStateRegistryAttached) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (getLifecycle().getState() == AbstractC6165l.b.f55499a) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        InterfaceC14655A interfaceC14655A = this.viewModelStoreProvider;
        if (interfaceC14655A != null) {
            return interfaceC14655A.a(this.id);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public final void h(AbstractC6165l.a event) {
        Intrinsics.j(event, "event");
        this.hostLifecycleState = event.e();
        l();
    }

    public int hashCode() {
        Set<String> setKeySet;
        int iHashCode = (this.id.hashCode() * 31) + this.destination.hashCode();
        Bundle bundle = this.immutableArgs;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i10 = iHashCode * 31;
                Object obj = this.immutableArgs.get((String) it.next());
                iHashCode = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((iHashCode * 31) + getLifecycle().hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    public final void i(Bundle outBundle) {
        Intrinsics.j(outBundle, "outBundle");
        this.savedStateRegistryController.e(outBundle);
    }

    public final void j(C14675p c14675p) {
        Intrinsics.j(c14675p, "<set-?>");
        this.destination = c14675p;
    }

    public final void k(AbstractC6165l.b maxState) {
        Intrinsics.j(maxState, "maxState");
        this.maxLifecycle = maxState;
        l();
    }

    public final void l() {
        if (!this.savedStateRegistryAttached) {
            this.savedStateRegistryController.c();
            this.savedStateRegistryAttached = true;
            if (this.viewModelStoreProvider != null) {
                C6141O.c(this);
            }
            this.savedStateRegistryController.d(this.savedState);
        }
        if (this.hostLifecycleState.ordinal() < this.maxLifecycle.ordinal()) {
            this._lifecycle.n(this.hostLifecycleState);
        } else {
            this._lifecycle.n(this.maxLifecycle);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C14667h.class.getSimpleName());
        sb2.append('(' + this.id + ')');
        sb2.append(" destination=");
        sb2.append(this.destination);
        String string = sb2.toString();
        Intrinsics.i(string, "sb.toString()");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14667h(C14667h entry, Bundle bundle) {
        this(entry.context, entry.destination, bundle, entry.hostLifecycleState, entry.viewModelStoreProvider, entry.id, entry.savedState);
        Intrinsics.j(entry, "entry");
        this.hostLifecycleState = entry.hostLifecycleState;
        k(entry.maxLifecycle);
    }
}
