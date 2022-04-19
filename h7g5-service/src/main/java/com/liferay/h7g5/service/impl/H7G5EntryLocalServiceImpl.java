/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.h7g5.service.impl;

import java.util.List;
import com.liferay.h7g5.model.H7G5Entry;
import com.liferay.h7g5.service.base.H7G5EntryLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.liferay.h7g5.model.H7G5Entry", service = AopService.class)

public class H7G5EntryLocalServiceImpl extends H7G5EntryLocalServiceBaseImpl {

	@Override
	public List<H7G5Entry> getByH7G5FolderId(
			long h7g5folderId, int start, int end) {

		return h7g5EntryPersistence.findByH7G5FolderId(
				h7g5folderId, start, end);
	}

	@Override
	public H7G5Entry getByKey(
			String folderKey) throws PortalException {

		return h7g5EntryPersistence.findByKey(
				folderKey);
	}

	@Override
	public List<H7G5Entry> getByName(
			String folderName, int start, int end) {

		return h7g5EntryPersistence.findByName(
				folderName, start, end);
	}

	@Override
	public H7G5Entry getByH_D_N(
			long h7g5FolderId, String description, String name) throws PortalException {

		return h7g5EntryPersistence.findByH_D_N(
				h7g5FolderId, description, name);
	}

}
