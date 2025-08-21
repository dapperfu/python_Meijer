package net.zetetic.database.sqlcipher;

import java.util.Map;
import java.util.regex.Pattern;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* loaded from: classes14.dex */
public class SQLiteQueryBuilder {

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f152392f = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f152393a = null;

    /* renamed from: b, reason: collision with root package name */
    private String f152394b = "";

    /* renamed from: c, reason: collision with root package name */
    private StringBuilder f152395c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f152396d = false;

    /* renamed from: e, reason: collision with root package name */
    private SQLiteDatabase.CursorFactory f152397e = null;
}
