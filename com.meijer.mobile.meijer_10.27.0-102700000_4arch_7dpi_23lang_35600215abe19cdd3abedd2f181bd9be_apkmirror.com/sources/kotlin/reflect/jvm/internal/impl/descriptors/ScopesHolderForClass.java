package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes13.dex */
public final class ScopesHolderForClass<T extends MemberScope> {

    /* renamed from: a, reason: collision with root package name */
    private final ClassDescriptor f143643a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1<KotlinTypeRefiner, T> f143644b;

    /* renamed from: c, reason: collision with root package name */
    private final KotlinTypeRefiner f143645c;

    /* renamed from: d, reason: collision with root package name */
    private final NotNullLazyValue f143646d;

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f143642f = {Reflection.j(new PropertyReference1Impl(ScopesHolderForClass.class, "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f143641e = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T extends MemberScope> ScopesHolderForClass<T> a(ClassDescriptor classDescriptor, StorageManager storageManager, KotlinTypeRefiner kotlinTypeRefinerForOwnerModule, Function1<? super KotlinTypeRefiner, ? extends T> scopeFactory) {
            Intrinsics.j(classDescriptor, "classDescriptor");
            Intrinsics.j(storageManager, "storageManager");
            Intrinsics.j(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
            Intrinsics.j(scopeFactory, "scopeFactory");
            return new ScopesHolderForClass<>(classDescriptor, storageManager, scopeFactory, kotlinTypeRefinerForOwnerModule, null);
        }
    }

    public /* synthetic */ ScopesHolderForClass(ClassDescriptor classDescriptor, StorageManager storageManager, Function1 function1, KotlinTypeRefiner kotlinTypeRefiner, DefaultConstructorMarker defaultConstructorMarker) {
        this(classDescriptor, storageManager, function1, kotlinTypeRefiner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ScopesHolderForClass(ClassDescriptor classDescriptor, StorageManager storageManager, Function1<? super KotlinTypeRefiner, ? extends T> function1, KotlinTypeRefiner kotlinTypeRefiner) {
        this.f143643a = classDescriptor;
        this.f143644b = function1;
        this.f143645c = kotlinTypeRefiner;
        this.f143646d = storageManager.c(new g(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MemberScope d(ScopesHolderForClass scopesHolderForClass, KotlinTypeRefiner kotlinTypeRefiner) {
        return scopesHolderForClass.f143644b.invoke(kotlinTypeRefiner);
    }

    private final T e() {
        return (T) StorageKt.a(this.f143646d, this, f143642f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MemberScope f(ScopesHolderForClass scopesHolderForClass) {
        return scopesHolderForClass.f143644b.invoke(scopesHolderForClass.f143645c);
    }

    public final T c(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (!kotlinTypeRefiner.d(DescriptorUtilsKt.s(this.f143643a))) {
            return (T) e();
        }
        TypeConstructor typeConstructorI = this.f143643a.i();
        Intrinsics.i(typeConstructorI, "getTypeConstructor(...)");
        return !kotlinTypeRefiner.e(typeConstructorI) ? (T) e() : (T) kotlinTypeRefiner.c(this.f143643a, new h(this, kotlinTypeRefiner));
    }
}
