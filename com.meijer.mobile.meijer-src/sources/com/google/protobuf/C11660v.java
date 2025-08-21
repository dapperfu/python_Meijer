package com.google.protobuf;

/* renamed from: com.google.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C11660v implements O {

    /* renamed from: a, reason: collision with root package name */
    private static final C11660v f91573a = new C11660v();

    public static C11660v c() {
        return f91573a;
    }

    @Override // com.google.protobuf.O
    public N a(Class<?> cls) {
        if (!AbstractC11661w.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (N) AbstractC11661w.H(cls.asSubclass(AbstractC11661w.class)).w();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.protobuf.O
    public boolean b(Class<?> cls) {
        return AbstractC11661w.class.isAssignableFrom(cls);
    }

    private C11660v() {
    }
}
