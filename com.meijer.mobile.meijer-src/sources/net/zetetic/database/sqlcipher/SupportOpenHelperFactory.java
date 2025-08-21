package net.zetetic.database.sqlcipher;

import B4.d;

/* loaded from: classes14.dex */
public class SupportOpenHelperFactory implements d.c {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f152415a;

    /* renamed from: b, reason: collision with root package name */
    private final SQLiteDatabaseHook f152416b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f152417c;

    /* renamed from: d, reason: collision with root package name */
    private final int f152418d;

    public SupportOpenHelperFactory(byte[] bArr) {
        this(bArr, null, false);
    }

    public SupportOpenHelperFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z10) {
        this(bArr, sQLiteDatabaseHook, z10, -1);
    }

    @Override // B4.d.c
    public d a(d.b bVar) {
        int i10 = this.f152418d;
        return i10 == -1 ? new SupportHelper(bVar, this.f152415a, this.f152416b, this.f152417c) : new SupportHelper(bVar, this.f152415a, this.f152416b, this.f152417c, i10);
    }

    public SupportOpenHelperFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z10, int i10) {
        this.f152415a = bArr;
        this.f152416b = sQLiteDatabaseHook;
        this.f152417c = z10;
        this.f152418d = i10;
    }
}
