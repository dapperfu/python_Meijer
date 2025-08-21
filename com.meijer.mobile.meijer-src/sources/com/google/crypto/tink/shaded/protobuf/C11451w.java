package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C11451w implements P {

    /* renamed from: a, reason: collision with root package name */
    private static final C11451w f89409a = new C11451w();

    public static C11451w c() {
        return f89409a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public O a(Class<?> cls) {
        if (!AbstractC11452x.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (O) AbstractC11452x.B(cls.asSubclass(AbstractC11452x.class)).p();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public boolean b(Class<?> cls) {
        return AbstractC11452x.class.isAssignableFrom(cls);
    }

    private C11451w() {
    }
}
