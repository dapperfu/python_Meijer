package net.zetetic.database.sqlcipher;

/* loaded from: classes13.dex */
public interface SQLiteTransactionListener {
    void onBegin();

    void onCommit();

    void onRollback();
}
