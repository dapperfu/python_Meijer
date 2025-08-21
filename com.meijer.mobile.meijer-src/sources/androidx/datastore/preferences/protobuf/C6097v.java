package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C6097v implements O {

    /* renamed from: a, reason: collision with root package name */
    private static final C6097v f54684a = new C6097v();

    public static C6097v c() {
        return f54684a;
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public N a(Class<?> cls) {
        if (!AbstractC6098w.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (N) AbstractC6098w.B(cls.asSubclass(AbstractC6098w.class)).q();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public boolean b(Class<?> cls) {
        return AbstractC6098w.class.isAssignableFrom(cls);
    }

    private C6097v() {
    }
}
