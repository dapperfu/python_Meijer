package g9;

import android.content.ContentValues;
import android.database.Cursor;
import e9.InterfaceC13782a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0013\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00065"}, d2 = {"Lg9/b;", "T", "Lg9/c;", "Lg9/d;", "", "tableName", "Lf9/c;", "dbHelper", "Ln9/b;", "concurrentHandlerHolder", "<init>", "(Ljava/lang/String;Lf9/c;Ln9/b;)V", "Landroid/database/Cursor;", "cursor", "", "e", "(Landroid/database/Cursor;)Ljava/util/List;", "item", "Landroid/content/ContentValues;", "c", "(Ljava/lang/Object;)Landroid/content/ContentValues;", "d", "(Landroid/database/Cursor;)Ljava/lang/Object;", "", "add", "(Ljava/lang/Object;)V", "specification", "", "a", "(Ljava/lang/Object;Lg9/d;)I", "f", "(Lg9/d;)Ljava/util/List;", "g", "(Lg9/d;)V", "", "isEmpty", "()Z", "Ljava/lang/String;", "getTableName", "()Ljava/lang/String;", "setTableName", "(Ljava/lang/String;)V", "b", "Lf9/c;", "getDbHelper", "()Lf9/c;", "setDbHelper", "(Lf9/c;)V", "Ln9/b;", "getConcurrentHandlerHolder", "()Ln9/b;", "setConcurrentHandlerHolder", "(Ln9/b;)V", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: g9.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC14341b<T> implements c<T, d> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String tableName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private f9.c dbHelper;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private n9.b concurrentHandlerHolder;

    public abstract ContentValues c(T item);

    public abstract T d(Cursor cursor);

    public AbstractC14341b(String tableName, f9.c dbHelper, n9.b concurrentHandlerHolder) {
        Intrinsics.j(tableName, "tableName");
        Intrinsics.j(dbHelper, "dbHelper");
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        this.tableName = tableName;
        this.dbHelper = dbHelper;
        this.concurrentHandlerHolder = concurrentHandlerHolder;
    }

    private final List<T> e(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor.moveToFirst()) {
            while (!cursor.isAfterLast()) {
                T tD = d(cursor);
                if (tD != null) {
                    arrayList.add(tD);
                }
                cursor.moveToNext();
            }
        }
        return arrayList;
    }

    @Override // g9.c
    public int a(T item, d specification) {
        Intrinsics.j(specification, "specification");
        ContentValues contentValuesC = c(item);
        InterfaceC13782a interfaceC13782aB = this.dbHelper.b();
        interfaceC13782aB.n();
        try {
            int iA = interfaceC13782aB.a(this.tableName, contentValuesC, specification.getSelection(), specification.getArgs());
            Unit unit = Unit.f143329a;
            interfaceC13782aB.q();
            return iA;
        } finally {
            interfaceC13782aB.r();
        }
    }

    @Override // g9.c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List<T> b(d specification) {
        Intrinsics.j(specification, "specification");
        Cursor cursorC = this.dbHelper.a().c(specification.c(), this.tableName, specification.g(), specification.getSelection(), specification.getArgs(), specification.e(), specification.a(), specification.b(), specification.d());
        try {
            List<T> listE = e(cursorC);
            CloseableKt.a(cursorC, null);
            return listE;
        } finally {
        }
    }

    @Override // g9.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void remove(d specification) {
        Intrinsics.j(specification, "specification");
        InterfaceC13782a interfaceC13782aB = this.dbHelper.b();
        interfaceC13782aB.n();
        try {
            interfaceC13782aB.e(this.tableName, specification.getSelection(), specification.getArgs());
            Unit unit = Unit.f143329a;
            interfaceC13782aB.q();
        } finally {
            interfaceC13782aB.r();
        }
    }

    @Override // g9.c
    public boolean isEmpty() {
        Cursor cursorD = this.dbHelper.a().d("SELECT COUNT(*) FROM " + this.tableName + ";", null);
        try {
            cursorD.moveToFirst();
            boolean z10 = cursorD.getInt(cursorD.getColumnIndexOrThrow("COUNT(*)")) == 0;
            CloseableKt.a(cursorD, null);
            return z10;
        } finally {
        }
    }

    @Override // g9.c
    public void add(T item) {
        ContentValues contentValuesC = c(item);
        InterfaceC13782a interfaceC13782aB = this.dbHelper.b();
        interfaceC13782aB.n();
        try {
            interfaceC13782aB.f(this.tableName, null, contentValuesC);
            interfaceC13782aB.q();
        } finally {
            interfaceC13782aB.r();
        }
    }
}
