package com.yinghuanhang.pdf.parser.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.yinghuanhang.pdf.parser.db.entity.TxtInfo;

import com.yinghuanhang.pdf.parser.db.TxtInfoDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig txtInfoDaoConfig;

    private final TxtInfoDao txtInfoDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        txtInfoDaoConfig = daoConfigMap.get(TxtInfoDao.class).clone();
        txtInfoDaoConfig.initIdentityScope(type);

        txtInfoDao = new TxtInfoDao(txtInfoDaoConfig, this);

        registerDao(TxtInfo.class, txtInfoDao);
    }
    
    public void clear() {
        txtInfoDaoConfig.clearIdentityScope();
    }

    public TxtInfoDao getTxtInfoDao() {
        return txtInfoDao;
    }

}
