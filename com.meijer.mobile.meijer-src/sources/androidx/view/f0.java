package androidx.view;

import V2.CreationExtras;
import X2.j;
import android.app.Application;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0005\u0015\u001f \u0018\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0004\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\u0010J(\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0087\u0002¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\u001c\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0087\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/lifecycle/f0;", "", "LV2/d;", "impl", "<init>", "(LV2/d;)V", "Landroidx/lifecycle/g0;", PlaceTypes.STORE, "Landroidx/lifecycle/f0$c;", "factory", "LV2/a;", "defaultCreationExtras", "(Landroidx/lifecycle/g0;Landroidx/lifecycle/f0$c;LV2/a;)V", "Landroidx/lifecycle/h0;", "owner", "(Landroidx/lifecycle/h0;)V", "(Landroidx/lifecycle/h0;Landroidx/lifecycle/f0$c;)V", "Landroidx/lifecycle/c0;", "T", "Lkotlin/reflect/KClass;", "modelClass", "c", "(Lkotlin/reflect/KClass;)Landroidx/lifecycle/c0;", "Ljava/lang/Class;", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/c0;", "", "key", "b", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Landroidx/lifecycle/c0;", "LV2/d;", "e", "d", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final CreationExtras.c<String> f55481c;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final V2.d impl;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ/\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0015R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/f0$a;", "Landroidx/lifecycle/f0$d;", "Landroid/app/Application;", "application", "", "unused", "<init>", "(Landroid/app/Application;I)V", "()V", "(Landroid/app/Application;)V", "Landroidx/lifecycle/c0;", "T", "Ljava/lang/Class;", "modelClass", "app", "e", "(Ljava/lang/Class;Landroid/app/Application;)Landroidx/lifecycle/c0;", "LV2/a;", "extras", "create", "(Ljava/lang/Class;LV2/a;)Landroidx/lifecycle/c0;", "(Ljava/lang/Class;)Landroidx/lifecycle/c0;", "Landroid/app/Application;", "f", "a", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static class a extends d {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: g, reason: collision with root package name */
        private static a f55484g;

        /* renamed from: h, reason: collision with root package name */
        @JvmField
        public static final CreationExtras.c<Application> f55485h;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final Application application;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/f0$a$a;", "", "<init>", "()V", "Landroid/app/Application;", "application", "Landroidx/lifecycle/f0$a;", "a", "(Landroid/app/Application;)Landroidx/lifecycle/f0$a;", "_instance", "Landroidx/lifecycle/f0$a;", "LV2/a$c;", "APPLICATION_KEY", "LV2/a$c;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: androidx.lifecycle.f0$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final a a(Application application) {
                Intrinsics.j(application, "application");
                if (a.f55484g == null) {
                    a.f55484g = new a(application);
                }
                a aVar = a.f55484g;
                Intrinsics.g(aVar);
                return aVar;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/f0$a$b", "LV2/a$c;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b implements CreationExtras.c<Application> {
        }

        private a(Application application, int i10) {
            this.application = application;
        }

        @Override // androidx.lifecycle.f0.d, androidx.lifecycle.f0.c
        public <T extends c0> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.j(modelClass, "modelClass");
            Intrinsics.j(extras, "extras");
            if (this.application != null) {
                return (T) create(modelClass);
            }
            Application application = (Application) extras.a(f55485h);
            if (application != null) {
                return (T) e(modelClass, application);
            }
            if (C6153b.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.create(modelClass);
        }

        static {
            CreationExtras.Companion companion = CreationExtras.INSTANCE;
            f55485h = new b();
        }

        private final <T extends c0> T e(Class<T> modelClass, Application app) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            if (!C6153b.class.isAssignableFrom(modelClass)) {
                return (T) super.create(modelClass);
            }
            try {
                T tNewInstance = modelClass.getConstructor(Application.class).newInstance(app);
                Intrinsics.g(tNewInstance);
                return tNewInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e13);
            }
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            Intrinsics.j(application, "application");
        }

        @Override // androidx.lifecycle.f0.d, androidx.lifecycle.f0.c
        public <T extends c0> T create(Class<T> modelClass) {
            Intrinsics.j(modelClass, "modelClass");
            Application application = this.application;
            if (application != null) {
                return (T) e(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/f0$b;", "", "<init>", "()V", "Landroidx/lifecycle/h0;", "owner", "Landroidx/lifecycle/f0$c;", "factory", "LV2/a;", "extras", "Landroidx/lifecycle/f0;", "b", "(Landroidx/lifecycle/h0;Landroidx/lifecycle/f0$c;LV2/a;)Landroidx/lifecycle/f0;", "Landroidx/lifecycle/g0;", PlaceTypes.STORE, "a", "(Landroidx/lifecycle/g0;Landroidx/lifecycle/f0$c;LV2/a;)Landroidx/lifecycle/f0;", "LV2/a$c;", "", "VIEW_MODEL_KEY", "LV2/a$c;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.f0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ f0 c(Companion companion, h0 h0Var, c cVar, CreationExtras creationExtras, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = j.f41523a.b(h0Var);
            }
            if ((i10 & 4) != 0) {
                creationExtras = j.f41523a.a(h0Var);
            }
            return companion.b(h0Var, cVar, creationExtras);
        }

        @JvmStatic
        public final f0 a(g0 store, c factory, CreationExtras extras) {
            Intrinsics.j(store, "store");
            Intrinsics.j(factory, "factory");
            Intrinsics.j(extras, "extras");
            return new f0(store, factory, extras);
        }

        @JvmStatic
        public final f0 b(h0 owner, c factory, CreationExtras extras) {
            Intrinsics.j(owner, "owner");
            Intrinsics.j(factory, "factory");
            Intrinsics.j(extras, "extras");
            return new f0(owner.getViewModelStore(), factory, extras);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0006\u0010\nJ/\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0006\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/f0$c;", "", "Landroidx/lifecycle/c0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/c0;", "LV2/a;", "extras", "(Ljava/lang/Class;LV2/a;)Landroidx/lifecycle/c0;", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;LV2/a;)Landroidx/lifecycle/c0;", "a", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = Companion.f55488a;

        default <T extends c0> T create(Class<T> modelClass) {
            Intrinsics.j(modelClass, "modelClass");
            return (T) j.f41523a.d();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/f0$c$a;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: androidx.lifecycle.f0$c$a, reason: from kotlin metadata */
        public static final class Companion {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ Companion f55488a = new Companion();

            private Companion() {
            }
        }

        default <T extends c0> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.j(modelClass, "modelClass");
            Intrinsics.j(extras, "extras");
            return (T) create(modelClass);
        }

        default <T extends c0> T create(KClass<T> modelClass, CreationExtras extras) {
            Intrinsics.j(modelClass, "modelClass");
            Intrinsics.j(extras, "extras");
            return (T) create(JvmClassMappingKt.b(modelClass), extras);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\fJ/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/f0$d;", "Landroidx/lifecycle/f0$c;", "<init>", "()V", "Landroidx/lifecycle/c0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/c0;", "LV2/a;", "extras", "(Ljava/lang/Class;LV2/a;)Landroidx/lifecycle/c0;", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;LV2/a;)Landroidx/lifecycle/c0;", "b", "a", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class d implements c {

        /* renamed from: c, reason: collision with root package name */
        private static d f55490c;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: d, reason: collision with root package name */
        @JvmField
        public static final CreationExtras.c<String> f55491d = f0.f55481c;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/f0$d$a;", "", "<init>", "()V", "Landroidx/lifecycle/f0$d;", "a", "()Landroidx/lifecycle/f0$d;", "getInstance$annotations", "instance", "_instance", "Landroidx/lifecycle/f0$d;", "LV2/a$c;", "", "VIEW_MODEL_KEY", "LV2/a$c;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: androidx.lifecycle.f0$d$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final d a() {
                if (d.f55490c == null) {
                    d.f55490c = new d();
                }
                d dVar = d.f55490c;
                Intrinsics.g(dVar);
                return dVar;
            }
        }

        @Override // androidx.lifecycle.f0.c
        public <T extends c0> T create(Class<T> modelClass) {
            Intrinsics.j(modelClass, "modelClass");
            return (T) X2.d.f41518a.a(modelClass);
        }

        @Override // androidx.lifecycle.f0.c
        public <T extends c0> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.j(modelClass, "modelClass");
            Intrinsics.j(extras, "extras");
            return (T) create(modelClass);
        }

        @Override // androidx.lifecycle.f0.c
        public <T extends c0> T create(KClass<T> modelClass, CreationExtras extras) {
            Intrinsics.j(modelClass, "modelClass");
            Intrinsics.j(extras, "extras");
            return (T) create(JvmClassMappingKt.b(modelClass), extras);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/f0$e;", "", "<init>", "()V", "Landroidx/lifecycle/c0;", "viewModel", "", "a", "(Landroidx/lifecycle/c0;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class e {
        public void a(c0 viewModel) {
            Intrinsics.j(viewModel, "viewModel");
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/f0$f", "LV2/a$c;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f implements CreationExtras.c<String> {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public f0(g0 store, c factory) {
        this(store, factory, null, 4, null);
        Intrinsics.j(store, "store");
        Intrinsics.j(factory, "factory");
    }

    static {
        CreationExtras.Companion companion = CreationExtras.INSTANCE;
        f55481c = new f();
    }

    private f0(V2.d dVar) {
        this.impl = dVar;
    }

    public <T extends c0> T a(Class<T> modelClass) {
        Intrinsics.j(modelClass, "modelClass");
        return (T) c(JvmClassMappingKt.e(modelClass));
    }

    public final <T extends c0> T b(String key, KClass<T> modelClass) {
        Intrinsics.j(key, "key");
        Intrinsics.j(modelClass, "modelClass");
        return (T) this.impl.d(modelClass, key);
    }

    public final <T extends c0> T c(KClass<T> modelClass) {
        Intrinsics.j(modelClass, "modelClass");
        return (T) V2.d.e(this.impl, modelClass, null, 2, null);
    }

    public /* synthetic */ f0(g0 g0Var, c cVar, CreationExtras creationExtras, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(g0Var, cVar, (i10 & 4) != 0 ? CreationExtras.b.f39630c : creationExtras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public f0(g0 store, c factory, CreationExtras defaultCreationExtras) {
        this(new V2.d(store, factory, defaultCreationExtras));
        Intrinsics.j(store, "store");
        Intrinsics.j(factory, "factory");
        Intrinsics.j(defaultCreationExtras, "defaultCreationExtras");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f0(h0 owner) {
        Intrinsics.j(owner, "owner");
        g0 viewModelStore = owner.getViewModelStore();
        j jVar = j.f41523a;
        this(viewModelStore, jVar.b(owner), jVar.a(owner));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(h0 owner, c factory) {
        this(owner.getViewModelStore(), factory, j.f41523a.a(owner));
        Intrinsics.j(owner, "owner");
        Intrinsics.j(factory, "factory");
    }
}
