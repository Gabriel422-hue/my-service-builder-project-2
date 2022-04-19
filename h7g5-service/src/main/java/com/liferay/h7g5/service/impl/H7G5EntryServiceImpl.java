/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.h7g5.service.impl;

import java.util.List;
import java.util.Objects;
import com.liferay.h7g5.model.H7G5Entry;
import com.liferay.h7g5.service.base.H7G5EntryServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.security.auth.PrincipalException;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = {
		"json.web.service.context.name=ohqiwtsfhl",
		"json.web.service.context.path=H7G5Entry"
}, service = AopService.class)

public class H7G5EntryServiceImpl extends H7G5EntryServiceBaseImpl {

	private boolean EmailCheck(String email) {
		return Objects.equals(email, "test@liferay.com");
	}

	@Override
	public List<H7G5Entry> getByH7G5FolderId(
			long h7g5FolderId, int start, int end) throws PortalException {

		User user = getUser();

		if (!EmailCheck(user.getEmailAddress())) {
			throw new PrincipalException("You are not test@liferay.com!");
		}

		return h7g5EntryLocalService.getByH7G5FolderId(
				h7g5FolderId, start, end);
	}

	@Override
	public H7G5Entry getByKey(
			String folderKey) throws PortalException {

		User user = getUser();

		if (!EmailCheck(user.getEmailAddress())) {
			throw new PrincipalException("You are not test@liferay.com!");
		}

		return h7g5EntryLocalService.getByKey(
				folderKey);
	}

	@Override
	public List<H7G5Entry> getByName(
			String folderName, int start, int end) throws PortalException {

		User user = getUser();

		if (!EmailCheck(user.getEmailAddress())) {
			throw new PrincipalException("You are not test@liferay.com!");
		}

		return h7g5EntryLocalService.getByName(
				folderName, start, end);
	}

	@Override
	public H7G5Entry getByH_D_N(
			long h7g5FolderId, String description, String name) throws PortalException {

		return h7g5EntryLocalService.getByH_D_N(
				h7g5FolderId, description, name);
	}

}