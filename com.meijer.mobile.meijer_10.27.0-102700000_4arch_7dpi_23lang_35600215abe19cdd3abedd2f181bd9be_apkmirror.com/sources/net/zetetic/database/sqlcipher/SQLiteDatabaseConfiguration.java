package net.zetetic.database.sqlcipher;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes13.dex */
public final class SQLiteDatabaseConfiguration {

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f151338j = Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");

    /* renamed from: a, reason: collision with root package name */
    public final String f151339a;

    /* renamed from: b, reason: collision with root package name */
    public final String f151340b;

    /* renamed from: c, reason: collision with root package name */
    public int f151341c;

    /* renamed from: d, reason: collision with root package name */
    public int f151342d;

    /* renamed from: e, reason: collision with root package name */
    public Locale f151343e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f151344f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f151345g;

    /* renamed from: h, reason: collision with root package name */
    public SQLiteDatabaseHook f151346h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList<SQLiteCustomFunction> f151347i;

    public SQLiteDatabaseConfiguration(String str, int i10) {
        this(str, i10, null, null);
    }

    public SQLiteDatabaseConfiguration(String str, int i10, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this.f151347i = new ArrayList<>();
        if (str == null) {
            throw new IllegalArgumentException("path must not be null.");
        }
        this.f151339a = str;
        this.f151340b = b(str);
        this.f151341c = i10;
        this.f151345g = bArr;
        this.f151346h = sQLiteDatabaseHook;
        this.f151342d = 25;
        this.f151343e = Locale.getDefault();
    }

    private static String b(String str) {
        int iIndexOf = str.indexOf(63);
        if (iIndexOf >= 0) {
            str = (String) str.subSequence(0, iIndexOf);
        }
        return str.indexOf(64) == -1 ? str : f151338j.matcher(str).replaceAll("XX@YY");
    }

    public boolean a() {
        return this.f151339a.equalsIgnoreCase(":memory:");
    }

    public void c(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("other must not be null.");
        }
        if (!this.f151339a.equals(sQLiteDatabaseConfiguration.f151339a)) {
            throw new IllegalArgumentException("other configuration must refer to the same database.");
        }
        this.f151341c = sQLiteDatabaseConfiguration.f151341c;
        this.f151342d = sQLiteDatabaseConfiguration.f151342d;
        this.f151343e = sQLiteDatabaseConfiguration.f151343e;
        this.f151344f = sQLiteDatabaseConfiguration.f151344f;
        this.f151345g = sQLiteDatabaseConfiguration.f151345g;
        this.f151346h = sQLiteDatabaseConfiguration.f151346h;
        this.f151347i.clear();
        this.f151347i.addAll(sQLiteDatabaseConfiguration.f151347i);
    }

    public SQLiteDatabaseConfiguration(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.f151347i = new ArrayList<>();
        if (sQLiteDatabaseConfiguration != null) {
            this.f151339a = sQLiteDatabaseConfiguration.f151339a;
            this.f151340b = sQLiteDatabaseConfiguration.f151340b;
            c(sQLiteDatabaseConfiguration);
            return;
        }
        throw new IllegalArgumentException("other must not be null.");
    }
}
