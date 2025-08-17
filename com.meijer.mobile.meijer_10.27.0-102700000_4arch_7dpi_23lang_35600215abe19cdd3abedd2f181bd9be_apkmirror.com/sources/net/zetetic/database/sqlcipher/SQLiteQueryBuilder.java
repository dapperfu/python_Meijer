package net.zetetic.database.sqlcipher;

import java.util.Map;
import java.util.regex.Pattern;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* loaded from: classes13.dex */
public class SQLiteQueryBuilder {

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f151383f = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f151384a = null;

    /* renamed from: b, reason: collision with root package name */
    private String f151385b = "";

    /* renamed from: c, reason: collision with root package name */
    private StringBuilder f151386c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f151387d = false;

    /* renamed from: e, reason: collision with root package name */
    private SQLiteDatabase.CursorFactory f151388e = null;
}
