package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* loaded from: classes13.dex */
class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeCheckerState f146809a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeSystemContext f146810b;

    /* renamed from: c, reason: collision with root package name */
    private final RigidTypeMarker f146811c;

    /* renamed from: d, reason: collision with root package name */
    private final RigidTypeMarker f146812d;

    public b(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        this.f146809a = typeCheckerState;
        this.f146810b = typeSystemContext;
        this.f146811c = rigidTypeMarker;
        this.f146812d = rigidTypeMarker2;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return Boolean.valueOf(AbstractTypeChecker.y(this.f146809a, this.f146810b, this.f146811c, this.f146812d));
    }
}
