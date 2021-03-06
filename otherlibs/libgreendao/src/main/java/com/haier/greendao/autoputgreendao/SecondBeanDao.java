package com.haier.greendao.autoputgreendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.haier.greendao.demogreendao.bean.SecondBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SECOND_BEAN".
*/
public class SecondBeanDao extends AbstractDao<SecondBean, Long> {

    public static final String TABLENAME = "SECOND_BEAN";

    /**
     * Properties of entity SecondBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Sex = new Property(2, int.class, "sex", false, "SEX");
        public final static Property Num = new Property(3, String.class, "num", false, "NUM");
        public final static Property Address = new Property(4, String.class, "address", false, "ADDRESS");
        public final static Property Flag = new Property(5, String.class, "flag", false, "FLAG");
        public final static Property Doornum = new Property(6, String.class, "doornum", false, "DOORNUM");
    }


    public SecondBeanDao(DaoConfig config) {
        super(config);
    }
    
    public SecondBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SECOND_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"NAME\" TEXT," + // 1: name
                "\"SEX\" INTEGER NOT NULL ," + // 2: sex
                "\"NUM\" TEXT," + // 3: num
                "\"ADDRESS\" TEXT," + // 4: address
                "\"FLAG\" TEXT," + // 5: flag
                "\"DOORNUM\" TEXT);"); // 6: doornum
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SECOND_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, SecondBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
        stmt.bindLong(3, entity.getSex());
 
        String num = entity.getNum();
        if (num != null) {
            stmt.bindString(4, num);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(5, address);
        }
 
        String flag = entity.getFlag();
        if (flag != null) {
            stmt.bindString(6, flag);
        }
 
        String doornum = entity.getDoornum();
        if (doornum != null) {
            stmt.bindString(7, doornum);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, SecondBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
        stmt.bindLong(3, entity.getSex());
 
        String num = entity.getNum();
        if (num != null) {
            stmt.bindString(4, num);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(5, address);
        }
 
        String flag = entity.getFlag();
        if (flag != null) {
            stmt.bindString(6, flag);
        }
 
        String doornum = entity.getDoornum();
        if (doornum != null) {
            stmt.bindString(7, doornum);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public SecondBean readEntity(Cursor cursor, int offset) {
        SecondBean entity = new SecondBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.getInt(offset + 2), // sex
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // num
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // address
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // flag
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // doornum
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, SecondBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSex(cursor.getInt(offset + 2));
        entity.setNum(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setAddress(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setFlag(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setDoornum(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(SecondBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(SecondBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(SecondBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
