package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5955v implements O {

    /* renamed from: a, reason: collision with root package name */
    private static final C5955v f54460a = new C5955v();

    public static C5955v c() {
        return f54460a;
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public N a(Class<?> cls) {
        if (!AbstractC5956w.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (N) AbstractC5956w.B(cls.asSubclass(AbstractC5956w.class)).q();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public boolean b(Class<?> cls) {
        return AbstractC5956w.class.isAssignableFrom(cls);
    }

    private C5955v() {
    }
}
