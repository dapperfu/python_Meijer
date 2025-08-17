package com.google.protobuf;

/* renamed from: com.google.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C11535v implements O {

    /* renamed from: a, reason: collision with root package name */
    private static final C11535v f90734a = new C11535v();

    public static C11535v c() {
        return f90734a;
    }

    @Override // com.google.protobuf.O
    public N a(Class<?> cls) {
        if (!AbstractC11536w.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (N) AbstractC11536w.H(cls.asSubclass(AbstractC11536w.class)).w();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.protobuf.O
    public boolean b(Class<?> cls) {
        return AbstractC11536w.class.isAssignableFrom(cls);
    }

    private C11535v() {
    }
}
