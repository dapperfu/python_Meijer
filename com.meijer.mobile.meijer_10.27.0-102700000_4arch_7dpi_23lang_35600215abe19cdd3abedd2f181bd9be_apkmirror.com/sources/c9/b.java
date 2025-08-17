package c9;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lc9/b;", "", "<init>", "()V", "", "authority", "Landroid/net/Uri;", "a", "(Ljava/lang/String;)Landroid/net/Uri;", "", "b", "[Ljava/lang/String;", "getUPGRADE_TO_1", "()[Ljava/lang/String;", "UPGRADE_TO_1", "c", "getUPGRADE_TO_2", "UPGRADE_TO_2", "d", "getUPGRADE_TO_3", "UPGRADE_TO_3", "e", "getUPGRADE_TO_4", "UPGRADE_TO_4", "f", "getUPGRADE_TO_5", "UPGRADE_TO_5", "g", "[[Ljava/lang/String;", "MIGRATION", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f61662a = new b();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final String[] UPGRADE_TO_1;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final String[] UPGRADE_TO_2;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final String[] UPGRADE_TO_3;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final String[] UPGRADE_TO_4;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final String[] UPGRADE_TO_5;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final String[][] MIGRATION;

    static {
        String[] strArr = {"CREATE TABLE IF NOT EXISTS request (request_id TEXT,method TEXT,url TEXT,headers BLOB,payload BLOB,timestamp INTEGER);"};
        UPGRADE_TO_1 = strArr;
        String[] strArr2 = {"ALTER TABLE request ADD COLUMN ttl INTEGER DEFAULT 9223372036854775807;"};
        UPGRADE_TO_2 = strArr2;
        String[] strArr3 = {"CREATE TABLE IF NOT EXISTS shard (shard_id TEXT,type TEXT,data BLOB,timestamp INTEGER,ttl INTEGER);", "CREATE INDEX shard_id_index ON shard (shard_id);", "CREATE INDEX shard_type_index ON shard (type);"};
        UPGRADE_TO_3 = strArr3;
        String[] strArr4 = {"CREATE TABLE IF NOT EXISTS displayed_iam (campaign_id TEXT,timestamp INTEGER);", "CREATE TABLE IF NOT EXISTS button_clicked (campaign_id TEXT,button_id TEXT,timestamp INTEGER);"};
        UPGRADE_TO_4 = strArr4;
        String[] strArr5 = {"CREATE TABLE IF NOT EXISTS hardware_identification (\n                    hardware_id TEXT,\n                    encrypted_hardware_id TEXT,\n                    salt TEXT,\n                    iv TEXT\n                    );"};
        UPGRADE_TO_5 = strArr5;
        MIGRATION = new String[][]{strArr, strArr2, strArr3, strArr4, strArr5};
    }

    public final Uri a(String authority) {
        Intrinsics.j(authority, "authority");
        Uri uriBuild = Uri.parse("content://" + authority).buildUpon().appendPath("hardware_identification").build();
        Intrinsics.i(uriBuild, "build(...)");
        return uriBuild;
    }

    private b() {
    }
}
