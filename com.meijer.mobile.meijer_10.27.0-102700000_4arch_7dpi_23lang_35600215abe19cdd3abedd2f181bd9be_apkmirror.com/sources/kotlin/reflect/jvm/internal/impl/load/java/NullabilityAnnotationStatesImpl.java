package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;

/* loaded from: classes13.dex */
public final class NullabilityAnnotationStatesImpl<T> implements NullabilityAnnotationStates<T> {

    /* renamed from: b, reason: collision with root package name */
    private final Map<FqName, T> f144272b;

    /* renamed from: c, reason: collision with root package name */
    private final LockBasedStorageManager f144273c;

    /* renamed from: d, reason: collision with root package name */
    private final MemoizedFunctionToNullable<FqName, T> f144274d;

    /* JADX WARN: Multi-variable type inference failed */
    public NullabilityAnnotationStatesImpl(Map<FqName, ? extends T> states) {
        Intrinsics.j(states, "states");
        this.f144272b = states;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Java nullability annotation states");
        this.f144273c = lockBasedStorageManager;
        MemoizedFunctionToNullable<FqName, T> memoizedFunctionToNullableG = lockBasedStorageManager.g(new h(this));
        Intrinsics.i(memoizedFunctionToNullableG, "createMemoizedFunctionWithNullableValues(...)");
        this.f144274d = memoizedFunctionToNullableG;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStates
    public T a(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        return this.f144274d.invoke(fqName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(NullabilityAnnotationStatesImpl nullabilityAnnotationStatesImpl, FqName fqName) {
        Intrinsics.g(fqName);
        return FqNamesUtilKt.a(fqName, nullabilityAnnotationStatesImpl.f144272b);
    }
}
