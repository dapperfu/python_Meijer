package net.zetetic.database.sqlcipher;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes14.dex */
public final class SQLiteDatabaseConfiguration {

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f152347j = Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");

    /* renamed from: a, reason: collision with root package name */
    public final String f152348a;

    /* renamed from: b, reason: collision with root package name */
    public final String f152349b;

    /* renamed from: c, reason: collision with root package name */
    public int f152350c;

    /* renamed from: d, reason: collision with root package name */
    public int f152351d;

    /* renamed from: e, reason: collision with root package name */
    public Locale f152352e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f152353f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f152354g;

    /* renamed from: h, reason: collision with root package name */
    public SQLiteDatabaseHook f152355h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList<SQLiteCustomFunction> f152356i;

    public SQLiteDatabaseConfiguration(String str, int i10) {
        this(str, i10, null, null);
    }

    public SQLiteDatabaseConfiguration(String str, int i10, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this.f152356i = new ArrayList<>();
        if (str == null) {
            throw new IllegalArgumentException("path must not be null.");
        }
        this.f152348a = str;
        this.f152349b = b(str);
        this.f152350c = i10;
        this.f152354g = bArr;
        this.f152355h = sQLiteDatabaseHook;
        this.f152351d = 25;
        this.f152352e = Locale.getDefault();
    }

    private static String b(String str) {
        int iIndexOf = str.indexOf(63);
        if (iIndexOf >= 0) {
            str = (String) str.subSequence(0, iIndexOf);
        }
        return str.indexOf(64) == -1 ? str : f152347j.matcher(str).replaceAll("XX@YY");
    }

    public boolean a() {
        return this.f152348a.equalsIgnoreCase(":memory:");
    }

    public void c(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("other must not be null.");
        }
        if (!this.f152348a.equals(sQLiteDatabaseConfiguration.f152348a)) {
            throw new IllegalArgumentException("other configuration must refer to the same database.");
        }
        this.f152350c = sQLiteDatabaseConfiguration.f152350c;
        this.f152351d = sQLiteDatabaseConfiguration.f152351d;
        this.f152352e = sQLiteDatabaseConfiguration.f152352e;
        this.f152353f = sQLiteDatabaseConfiguration.f152353f;
        this.f152354g = sQLiteDatabaseConfiguration.f152354g;
        this.f152355h = sQLiteDatabaseConfiguration.f152355h;
        this.f152356i.clear();
        this.f152356i.addAll(sQLiteDatabaseConfiguration.f152356i);
    }

    public SQLiteDatabaseConfiguration(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.f152356i = new ArrayList<>();
        if (sQLiteDatabaseConfiguration != null) {
            this.f152348a = sQLiteDatabaseConfiguration.f152348a;
            this.f152349b = sQLiteDatabaseConfiguration.f152349b;
            c(sQLiteDatabaseConfiguration);
            return;
        }
        throw new IllegalArgumentException("other must not be null.");
    }
}
