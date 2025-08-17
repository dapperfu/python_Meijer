package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C11326w implements P {

    /* renamed from: a, reason: collision with root package name */
    private static final C11326w f88569a = new C11326w();

    public static C11326w c() {
        return f88569a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public O a(Class<?> cls) {
        if (!AbstractC11327x.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (O) AbstractC11327x.B(cls.asSubclass(AbstractC11327x.class)).p();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public boolean b(Class<?> cls) {
        return AbstractC11327x.class.isAssignableFrom(cls);
    }

    private C11326w() {
    }
}
